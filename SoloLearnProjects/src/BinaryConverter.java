import java.util.Scanner;

public class BinaryConverter {
    /**Создать программу, которая
     * возвращает двоичную версию
     * входных данных
     * Ввод 42
     * Вывод 101010*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //1=1  2=10  3=11  4=100
//        String binary = "";
//        while (num > 0) {
//            binary = (num % 2) + binary;
//            num /= 2;
//        }
        System.out.println(Converter.toBinary(num));
    }
}
class Converter{
    public static String toBinary(int num){
        String binary="";
        while (num>0){
            binary=(num%2)+binary;
            num/=2;
        }
        return binary;
    }
}
