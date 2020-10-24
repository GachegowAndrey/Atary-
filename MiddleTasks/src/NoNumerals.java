import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class NoNumerals
{
    /*You write a phrase and include a lot of number character(0-9), but you decade that for numbers 10
    AND UNDER you would rather write the word our instead.
    CAn you go in and edit your phrase to write out the name of each number instead of using the numeral?
    Task
    Take a phrase and replace any instances of an integer from 0-10 and replace it with English word that
     corresponds to thea integer.
     Input
     A string of the phrase in its original form(lowercase)
     Output
     A String of the update phrase that has changed the numerals to words
     Sample
     I
     i need 2 pumpkins and 3 apples
     O
     i need two pumpkins and three apples
     Explanation
     You would update the phrase to change 2 to two and 3 to three
     */
    public static void main(String[]args)throws Exception
    {
        Scanner read = new Scanner(System.in);
        String speak = read.nextLine();
        String[] words = speak.split("\\s+");
        String[] numbersD= {"1","2", "3","4","5","6","7","8","9","10" };
        String[] numbersL = {"one", "two", "three", "four","five","six","seven","eight","nine","ten"};

        for (String word : words)
        {
            for (int i=0; i<numbersL.length;i++)
            {
                if(Objects.equals(word, numbersD[i]))
                {
//                    word.replace(word,numbersL[i]);
                    word=(numbersL[i]);
                }
            }
            System.out.print((word) +" ");
        }
//        System.out.print(Arrays.toString(word) +" ");
    }
}
