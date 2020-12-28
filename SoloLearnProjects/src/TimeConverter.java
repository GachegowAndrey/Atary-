import java.util.Scanner;

public class TimeConverter {
    /**Перевод дней в секунды*/
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println((day*24*60*60)+" seconds in "+day+" days");
    }
}
