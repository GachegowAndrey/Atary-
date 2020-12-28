package graphics;

import main.GameField;

//Определяет действия, которые должен производить графический модуль игры.
public interface GraphicsModule {
    //Отрисовывает переданное игровое поле
    void draw(GameField field);
    //Возвращает true, если в окне нажат "крестик"
    boolean isClosedRequest();
   //Заключительные действия, на случай, если модулю нужно подчистить за собой.
    void destroy();
}
