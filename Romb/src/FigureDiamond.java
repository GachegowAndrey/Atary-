import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FigureDiamond {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter height");//высота количество строк
        int height= Integer.parseInt(reader.readLine());
        if (height==2){
            System.out.println("Error. Enter number>2");
        }
        System.out.println("Enter width");//ширина длина строк
        int width= Integer.parseInt(reader.readLine());
        if (width==2){
            System.out.println("Error. Enter number>2");
        }
        printDiamond(height,width);
    }
    private static void printDiamond(int height,int width){
        for (int i = 1; i <=height; i++) {
            for (int j = 1; j <=width; j++) {
               // System.out.print("1 ");
                if (width%2==0){
                    //int widthRomb=width/2;
                    System.out.println(555);

                }else {
                   // int widthRomb=(width-1)/2;
                    if (i+j==3||i+j==5){
                        System.out.print("1");
                    }else {
                        System.out.print("0");
                    }

                }
            }
            System.out.println();
        }
        System.out.println(height+" height");
        System.out.println(width+" width");
    }
}
/**
 * 010  (11,12,13)3 длина-(1*0)
 * 101  (21,22,23)3 5
 * 010  (31,32,33)5 длина+(1*2)
 *
 * 0110 (11,12,13,14)3 4
 * 1001 (21,22,23,24)3 6
 * 0110 (31,32,33,34)5 6
 *
 * 00100 (11,12,13,14,15)4 длина-(1*1)
 * 01010 (21,22,23,24,25)4 6
 * 10001 (31,32,33,34,35)4 8
 * 01010 (41,42,43,44,45)6 8
 * 00100 (51,52,53,54,55)8 длина+(1*3)
 *
 * 0001000 (11,12,13,14,15,16,17)5 длина-(1*2)
 * 0010100 (21,22,23,24,25,26,27)5 7
 * 0100010 (31,32,33,34,35,36,37)5 9
 * 1000001 (41,42,43,44,45,46,47)5 11
 * 0100010 (51,52,53,54,55,56,57)7 11
 * 0010100 (61,62,63,64,65,66,67)7 11
 * 0001000 (71,72,73,74,75,76,77)11 длина+(1*4)
 *
 * 3=4 5=8 7=12 9=16 11=20 (x+1+2(0) x+1+2(1) x+1+2(2) x+1+2(3) x+1+2(4) )
 */