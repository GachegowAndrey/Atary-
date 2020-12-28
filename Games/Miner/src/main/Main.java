package main;

//import graphics.GraphicsModule;
//import keyboard.KeyboardHandleModule;
//import mouse.Click;
//import mouse.MouseHandleModule;
// import graphics.GraphicsModule;
//import graphics.module.GraphicsModules;
//import keyboard.KeyboardHandleModule;
//import keyboard.lwjglmodule.LwjglKeyboardHandleModules;
//import mouse.Click;
//import mouse.MouseHandleModule;
//import mouse.lwjglmodule.LwjglMouseHandleModules


import graphics.GraphicsModule;
import graphics.module.GraphicsModules;
import keyboard.KeyboardHandleModule;
import keyboard.module.KeyboardHandleModules;
import mouse.Click;
import mouse.MouseHandleModule;
import mouse.module.MouseHandleModules;

import java.util.LinkedList;

/*Главный управляющий класс.
 *Считывает действия пользователя, передаёт данные в graphicsModule, затем обрабатывает результат.
 */
public class Main {
    private static boolean endOfGame;
    private static GraphicsModule graphicsModule;
    private static KeyboardHandleModule keyboardModule;
    private static MouseHandleModule mouseModule;
    private static LinkedList<Click> clickStack;
    private static GameField gameField;
    //Точка входа. Содержит все необходимые действия для одного игрового цикла.
    public static void main(String[] args) {
        initField();

        while (!endOfGame){
            input();
            logic();
            graphicsModule.draw(gameField);
        }
        graphicsModule.destroy();
    }
    //Задаёт значения полей для начала игры
    private static void initField(){
        endOfGame=false;
        graphicsModule=  new GraphicsModules();
        keyboardModule=new KeyboardHandleModules();
        mouseModule=new MouseHandleModules();
        gameField=new GameField();
        clickStack=new LinkedList<Click>();

    }
    private static void input(){
        keyboardModule.update();
        mouseModule.update();
        clickStack=mouseModule.getClickStack();
        endOfGame=endOfGame||graphicsModule.isClosedRequest()||keyboardModule.wasEscPressed();
    }
    //Основная логика игры.
    public static void logic(){
        for(Click click: clickStack){
            gameField.receiveClick(click);
        }
    }

}
