package main;

public class ErrorCatcher {
    public static void cantDisplayCellWrongMinesNear() {
        System.err.println("Failed to display a cell -- wrong mines near param.");
        System.exit(-2);
    }

    /**
     * Внутренняя ошибка графического модуля
     *
     * @param e Выброшенное исключение
     */
    public static void graphicsFailure(Exception e) {
        System.err.println("GraphicsModule failed.");
        e.printStackTrace();
        System.exit(-3);
    }
}
