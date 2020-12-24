package Computer;

public class Main
{
    public static void main(String[] args) {
        Computer computer= new Computer(new KeyBoard(),new Monitor(),new Mouse());
        if (isWork(computer.getKeyBoard())&&isWork(computer.getMonitor())
        &&isWork(computer.getMouse()))
        {
            System.out.println("Work");
        }
    }

    public static boolean isWork(CompItem item)
    {
        System.out.println(item.getName());
        return item.getName()!=null&&item.getName().length()>4;
    }

}
