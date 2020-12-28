package keyboard;
//Определяет параметры, которые игре необходимо считывать с клавиатуры
public interface KeyboardHandleModule {
    //Считывание последних данных из стека событий, если можулю это необходимо
    void update();
    //Возвращает информацию о том, был ли нажат ESCAPE за последнюю итерацию
    boolean wasEscPressed();
}
