import java.util.Scanner;

public class AverageWordLength
{
    /*You are in a college level English class, your professor want you to write an essay,
    but you need to find out the average length of all the words you use.
    It is up to you to figure out how long each word is and to average it out.
    Task
    Takes in a string, figure out the average length of all the words
     and return a number representing the average length.
      Remove all punctuation. Round up to the nearest whole number.
      Input
      A string containing multiple words.
      Output
      A number representing the average length of each word, rounded up to the nearest whole number.
      Sample
      I
      this phrase has multiple words
      O
      6
      Explanation
      The string in question has five words with a total 26 letters(spaces do not count).
      The average length is 5.20 letters , rounding it up to the nearest whole numbers results in 6.
     */
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String speak = read.nextLine();
        String speak1=speak.replaceAll("[^A-z, ]","");
        String[] words = speak1.split("\\s+");
        int length = 0;
        for (int i=0;i<words.length;i++)
        {
            length+=words[i].length();
        }
        System.out.println(length);
        System.out.println(speak1);
        System.out.println(words.length);
        System.out.println(length%words.length);
        System.out.println(length/words.length);
        if (length%words.length>0)
        {
            System.out.println(1+length/words.length);
        }
        else
        {
            System.out.println(length/words.length);
        }



    }
}
