import java.util.Scanner;

public class StringReverse {
    /**Написать программу, которая использу строку в качестве вводных данных
     * и  выведет в результате  ее же задом наперед
     * Ввод hello there
     * Вывод ereht olleh*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] box =string.toCharArray();
        for (int i = box.length-1; i >=0 ; i--) {
            System.out.print(box[i]);
        }
    }
}
