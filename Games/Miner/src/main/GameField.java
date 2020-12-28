package main;

import mouse.Click;

import java.util.Random;

import static main.Constants.*;

//Хранит и изменяет состояние игрового поля
public class GameField {
    // Матрица, хранящая клетки поля
    private Cell[][] theField;
    //Матрица, хранящая для каждой клетки поля количество мин рядом с ней
    private short[][] minesNear;

    public GameField(){
        theField=new Cell[COUNT_CELLS_X][COUNT_CELLS_Y];
        minesNear=new short[COUNT_CELLS_X][COUNT_CELLS_Y];
        Random random=new Random();
        for (int x = 0; x <COUNT_CELLS_X ; x++) {
            for (int y = 0; y <COUNT_CELLS_Y ; y++) {
                boolean isMine=random.nextInt(100)<SPAWN_CHANGE_OF_MINE;
                if (isMine){
                    theField[x][y]=new Cell(true);
                    for (int i = -1; i <2 ; i++) {
                        for (int j = -1; j <2 ; j++) {
                            if ((x+i>=0)&&(x+i<COUNT_CELLS_X)&&(y+j>=0)&&(y+j<COUNT_CELLS_Y)){
                                minesNear[x+i][y+j]++;
                            }
                        }
                    }
                } else {
                    theField[x][y]=new Cell(false);
                }
            }
        }
    }
    /**
     * @param x Координата X клетки
     * @param y Координата Y клетки
     * @return Клетка поля с координатами (X, Y)
     */
    public Cell getCell(int x, int y){
        return theField[x][y];
    }
    /**
     * @param x Координата X клетки
     * @param y Координата Y клетки
     * @return Количество мин рядом с клеткой с координатами (X, Y)
     */
    public int getMinesNear(int x,int y){
        return minesNear[x][y];
    }
    /**
     * Метод предназначен для обработки кликов по полю.
     *
     * @param click Информация о переданном клике
     * @return Возвращает результат клика (Если ничего важного не произошло -- ClickResult.REGULAR)
     */
    public void receiveClick(Click click){
        ClickResult clickResult = this.theField[click.x][click.y].receiveClick(click.button);
        switch (clickResult){
            case DETONATED:
                showAll();
                break;
            case OPENED:
                if (getMinesNear(click.x,click.y)==0){
                    for (int i = -1; i <1 ; i++) {
                        for (int j = -1; j <1; j++) {
                            if ((click.x + i >= 0) && (click.x + i < COUNT_CELLS_X)
                                    && (click.y + j >= 0) && (click.y + j < COUNT_CELLS_Y)){
                                Click psClick = new Click(click.x+i,click.y+j,click.button);
                                receiveClick(psClick);
                            }
                        }
                    }
                }
                break;
            case REGULAR:
            default:
                //ignore
                break;
        }
    }
    /**
     * Делает содержимое клетки с координатами (X, Y) видимым
     *
     * @param x Координата X клетки
     * @param y Координата Y клетки
     */
    public void show(int x,int y){
        theField[x][y].show();
    }
    /**
     * Делает видимым содержимое всех клеток поля
     */
    public void showAll(){
        for (Cell[] row :theField){
            for (Cell cell:row){
                cell.show();
            }
        }
    }
}
