import java.util.Scanner;

abstract class Shape{
    int width;
    abstract void area();
}
class Square extends Shape{
    public Square(int side) {
        this.width=side;
    }
    @Override
    void area() {
        int  square= width*width;
        System.out.println("Площадь квадрата - "+square);
    }
}
class Circle extends Shape{
    public Circle(int radius) {
        this.width=radius;
    }
    void area(){
        double square=  ((Math.PI)*width*width);
        System.out.println("Площадь круга - "+square);
    }
}
public class Figures {
    /**У вас на вход поступает ширина квадрата(сторона)
     * и круга(радиус), ваша задача посчитать площадь фигур,
     * используя входные данные.
     * Вход 5 2
     * Выход 25 12,566370614359172*/
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int side=scanner.nextInt();
        int radius=scanner.nextInt();

       Square square =new Square(side);
        Circle circle=new Circle(radius);
        square.area();
        circle.area();

    }
}
