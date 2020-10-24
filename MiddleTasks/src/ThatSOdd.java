import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class ThatSOdd
{
    /*You want to take a list of numbers and find the sum of all of the even numbers in list.
   Ignore any odd numbers .
   Task
   The first input denotes the length of the list (N). The nest N lines contain the list elements as integers.
   Output
   An integer that represents the sum of only the even numbers in the list.
   Explanation(9 1 2 3 4 5 6 7 8 9)
   If you add together 2, 4,6 and 8 from the list you get a sum of 20.
   Sample
   I
   9 1 2 3 4 5 6 7 8 9
   O
   20
    */
    public static void main(String[]args) throws NoSuchElementException, IOException {
        Scanner read = new Scanner(System.in);
        int length = read.nextInt();
        int sum=0;
        for (int i=0;i<length;i++)
        {
            BufferedReader numbers1= new BufferedReader(new InputStreamReader(System.in));
           // Scanner numbers = new Scanner(System.in);
            int number = Integer.parseInt(numbers1.readLine());
            if (number%2==0)
            {
                sum=sum +number;
            }
        }
        System.out.println(sum);

    }

}
