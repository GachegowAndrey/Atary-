package mouse.module;

import mouse.Click;
import org.lwjgl.input.Mouse;

import java.util.LinkedList;

//Реализует считывание с мыши необходимых игре параметров
public class MouseHandleModules implements mouse.MouseHandleModule {
    LinkedList<Click> stack;
    //Считывание последних данных из стека событий

    @Override
    public void update(){
        resetValues();
        while (Mouse.next()){
            ///Если это было нажатие кнопки мыши, а не
            ///перемещение...
            if (Mouse.getEventButton()>=0&&Mouse.getEventButtonState()){
                int x=Mouse.getEventX()/10;
                int y=Mouse.getEventY()/10;
                int button =Mouse.getEventButton();
                stack.add(new Click(x,y,button));
            }
        }
    }
    //Обнуление данных, полученых в при предыдущих запросах
    private void resetValues(){
        stack=new LinkedList<>();
    }
      //Возвращает стек кликов, произешдших за последнюю итерацию.
    public LinkedList<Click> getClickStack(){
        return stack;
    }
}
