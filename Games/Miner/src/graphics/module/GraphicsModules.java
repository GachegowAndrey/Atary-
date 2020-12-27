package graphics.module;
//Реализует графический модуль игры на основе LWJGL.

import main.*;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static main.Constants.*;
import static org.lwjgl.opengl.GL11.*;

public class GraphicsModules {
    private SpriteSystem spriteSystem;
    /**
     * Инициализирует графический движок и необходимые поля модуля.
     */
    public GraphicsModules() {
        initOpengl();
        spriteSystem = new SpriteSystem();
    }
    private void initOpengl() {
        try {
            /* Задаём размер будущего окна */
            Display.setDisplayMode(new DisplayMode(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));

            /* Задаём имя будущего окна */
            Display.setTitle(Constants.SCREEN_NAME);

            /* Создаём окно */
            Display.create();
        } catch (Exception e) {
            ErrorCatcher.graphicsFailure(e);
        }

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Constants.SCREEN_WIDTH,0, Constants.SCREEN_HEIGHT,1,-1);
        glMatrixMode(GL_MODELVIEW);

        /* Для поддержки текстур */
        glEnable(GL_TEXTURE_2D);

        /* Для поддержки прозрачности */
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);

        /* Белый фоновый цвет */
        glClearColor(1,1,1,1);
    }

    /**
     * Отрисовывает переданное игровое поле
     *
     * @param field Игровое поле, которое необходимо отрисовать
     */
    public void draw(GameField field){
        glClear(GL_COLOR_BUFFER_BIT);
        for (int i = 0; i <COUNT_CELLS_X ; i++) {
            for (int j = 0; j <COUNT_CELLS_Y ; j++) {
                drawSprite(CELL_SIZE*i,CELL_SIZE*j,calculateSprite(field.getCell(i,j),field.getMinesNear(i,j)));
            }
        }
        Display.update();
        Display.sync(60);
    }

    private SpriteSystem.Sprite calculateSprite(Cell cell,int minesNear){
        if (cell.isMarked()){
            if (!cell.isHidden()&&(cell.getState()!= CellState.MINE)){
                ///Если эта клетка не скрыта, и на ней
                ///ошибочно стоит флажок...
                return SpriteSystem.Sprite.BROKEN_FLAG;
            }//В другом случае --
            return SpriteSystem.Sprite.FLAG;
        } else if (cell.isHidden()){
            ///Если клетка не помечена, притом скрыта..
            return SpriteSystem.Sprite.SPACE;
        } else {
            //Если не помечена и не скрыта, выводим как есть
            switch (cell.getState()){
                case EMPTY:
                case MINE:
                    return SpriteSystem.Sprite.MINE;
                case DETONATED:
                    return SpriteSystem.Sprite.EXPLOSION;
                default:
                    if (minesNear>8||minesNear<0){
                        ErrorCatcher.cantDisplayCellWrongMinesNear();
                    }
                    return SpriteSystem.spriteByNumber[minesNear];
            }
        }
    }

    /**
     * Отрисовывает отдельную ячейку
     *
     * @param x Координата отрисовки X
     * @param y Координата отрисовки Y
     * @param sprite Текстура, которую надо отрисовывать
     */
    private void drawSprite(int x,int y,SpriteSystem.Sprite sprite){
        sprite.getTexture().bind();

        glBegin(GL_QUADS);
        glTexCoord2f(0,0);
        glVertex2f(x,y+ Constants.CELL_SIZE);
        glTexCoord2f(1,0);
        glVertex2f(x+Constants.CELL_SIZE,y+Constants.CELL_SIZE);
        glTexCoord2f(1,1);
        glVertex2f(x+Constants.CELL_SIZE,y);
        glTexCoord2f(0,1);
        glVertex2f(x,y);
        glEnd();
    }

    //Возвращает true, если в окне нажат "крестик"
    public boolean isClosedRequest(){
        return Display.isCloseRequested();
    }
    /**
     * Заключительные действия.
     * Принудительно уничтожает окно.
     */
    public void destroy(){
        Display.destroy();
    }
}
