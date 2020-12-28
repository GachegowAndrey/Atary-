package mouse;

import java.util.LinkedList;

//Определяет параметры, которые игре необходимо считывать с мыши.
public interface MouseHandleModule {

   // Считывание последних данных из стека событий, если можулю это необходимо
    void update();
    /**
     * Возвращает информацию о кликах пользователя за последнюю итерацию
     */
    LinkedList<Click> getClickStack();
}
