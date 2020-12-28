import java.util.Scanner;

public class CreditCalculator {
   /**Вы заняли у друга деньги и вам необходим рассчитать,
    * сколько вы будете ему должны через 6 месяцев.
    * каждый месяц вы будете возвращать ему по 10% от суммы долга
    * Вводные данные сумма долга
    * Вывод - остаток от суммы через 6 месяцев(суммы - целые числа)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month =6;
        int debt =scanner.nextInt();
        for (int i = 0; i <month ; i++) {
             debt -=  (int)debt *0.1;
            System.out.println(debt);
        }
        System.out.println("Debt "+debt);
    }
}
