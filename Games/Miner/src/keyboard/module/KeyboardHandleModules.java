package keyboard.module;

import org.lwjgl.input.Keyboard;

//Реализует считывание необходимых игре параметров с клавиатуры средствами LWJGL
public class KeyboardHandleModules implements keyboard.KeyboardHandleModule{
    //* Данные о вводе за последнюю итераци. */
    private boolean wasEscPressed;
    //Считывание последних данных из стека событий
    public void update(){
        resetValues();
        while (Keyboard.next()){
            switch (Keyboard.getEventCharacter()){
                case Keyboard.KEY_ESCAPE:
                wasEscPressed=true;
                break;
            }
        }
    }
    //Обнуление данных, полученых в при предыдущих запросах
    private void resetValues(){
        wasEscPressed=false;
    }
    //Возвращает информацию о том, был ли нажат ESCAPE за последнюю итерацию
    public boolean wasEscPressed(){
        return wasEscPressed;
    }
}
