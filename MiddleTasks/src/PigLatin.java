import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PigLatin
{
    /*You have two friends who speaking Pig Latin to each other!
    Pig Latin is the same words in the same order except tha you take the first letter of each word and
    put it on the end, then you add 'ay' to the and of that ("road" = "oadray")

    Task
    Your task is to take a sentence and turn it into the sentence in pig latin!
    input
    A string of the sentence in english  that you need to translate into pig latin.

    Output
    A string of the same sentence in pig Latin

    Sample
    I
    "nevermind youve got them"

    O
    "everminday ouveyay otgay hemtay"

    Explanation
    The output should be the original sentence with each word chanced so
    that they first letter is at  the end and then -ay is added after that/
     */
    public static void main(String[] args)  {

        Scanner read = new Scanner(System.in);
        String speak = read.nextLine();
        String[] words = speak.split("\\s+");
      //  ArrayList<String> list=new ArrayList<String>();
       // list.add(read.nextLine());
       // list=fix(list);
        for(String word: words)
        {
           // System.out.print(word+"ay"+" ");
            System.out.print(word.substring(1)+word.substring(0,1) +"ay"+" ");
        }

    }

}
