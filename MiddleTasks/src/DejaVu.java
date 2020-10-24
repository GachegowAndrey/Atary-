import java.util.Scanner;

public class DejaVu
{
     /*You aren't paying attention and you accidentally type a bunch of random letters on your keyboard.
    You want to know if you evr typed the same letter twice, or if they are all unique letters.
    Task
    If you are given a string of random letters ,
     your task is to evaluate whether any letter us repeated
     in the string or if you only hit unique keys while you typing.
     Input
     A string of random letter characters (no numbers or other buttons were passed)
     output
     A string that says 'Deja Vu' if any letters is repeated in the input string, or a string that
     says 'Unique'  if there are no repeats.
     saMPLE
     AAAAGHHH-->Deja Vu
     Explanation
     Your program should output 'Deja Vu' because there are many repetitions in AAAAGHHH
     */
     public static void main(String[] args)
     {
          Scanner read = new Scanner(System.in);
          String speak = read.nextLine();
          String[] words = speak.split("");
          int Unique=0;
               for (int i=0; i<words.length-1;i++)
               {
                    if(words[i].equals(words[i+1]))
                    {
                         Unique++;

                    }
                    System.out.println(words[i]);
               }
               if (Unique>0)
               {
                    System.out.println("Deja Vu");
               }
               else System.out.println("Unique");
               // System.out.print(word+"ay"+" ");
     }
}
