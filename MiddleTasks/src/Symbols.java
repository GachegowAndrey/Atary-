import java.util.Scanner;

public class Symbols
{
    /*There is a problem with use your keyboard: it randomly writes symbols
   when you you are typing a text. You need to clean up the text by removing all symbols.
   task
   Take a text that includes some random symbols and translate  it into a text
   that has none of them. The resulting text should only include letters and numbers.
   Input
   a string with randoms symbols.
   output
   A string of the text with all the symbols removed.
   Explanation
   If you take out every symbols and leave only the letters and numbers< your text says
   'lets go and get lunch'(l@@e$%t!^s go a^$&n&*d g^#e&$t l&$u^$n$%c#h)

    */
    public static void main(String []args)throws NullPointerException
    {
       // String[] word1=null;

        Scanner read = new Scanner(System.in);
        String speak = read.nextLine();
        String[] word = speak.split(" ");
        for (String word1:word)
        {
            System.out.print(word1.replaceAll("[^A-z,0-9]","")+" ");
        }





    }
}
