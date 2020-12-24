import java.util.ArrayList;
//Создать список, элементами которого будут массивы чисел
public class ListOfMassive
{
    public static void main(String[] args) {
        ArrayList<int[]> list=createList();
        printList(list);
    }
    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list=new ArrayList<>();
        list.add(new int[]{1,2,3,4,5});
        list.add(new int[]{1,2});
        list.add(new int[]{1,2,3,4});
        list.add(new int[]{});
        return list;
    }
    public static void printList(ArrayList<int[]> list)
    {
        for (int[] Array: list)
        {
            for (int x : Array)
            {
                System.out.println(x);
            }
        }
    }


}
