import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class SecretMessage
{
/*You are trying t o send a secret message , and you've  decided to encode it by replacing
every letter in your message with its correcponding
letter in a backwards version of the alphabet.
What do you messages look like?
Task
Create a program that replace each letter in a message with its corresponding letter in a backwards
version of the English alphabet,
Input
A string of your message in its normal form.
Output
A string of your message once you have encoded it (all lower case)
Sample
I
Hello World
O
svool dliow
abcdefghijklmnopqrstvwxyz
...wv00srqponmlkjigfedcba
Explanation
If you replace each letter in "Hello world"
with the corresponding letter in a backward version of the alphabet ,
you get "svool dliow"
*/
    public static void main(String[]args)throws Exception
    {
        Scanner read = new Scanner(System.in);
        String speak = read.nextLine();
        String speak1=speak.replaceAll("[^A-z, ]","");
        String[] word = speak.split("");

        ArrayList chars = new ArrayList();
        char [] charsCopy= new char[chars.size()];
        ArrayList chars1 = new ArrayList();
        char [] chars1Copy= new char[chars1.size()];

        for (int h='a';h<='z';h++)
        {
            chars.add((char)h);
        }
        for (int i='z';i>='a';i--)
        {
            chars1.add((char)i);
        }
        for (char j='a';j<='z';j++)
        {
            charsCopy[j]=j;
        }
        for (char i='z';i>='a';i--)
        {
            chars1Copy[i]=i;
        }
        for ( String words: word )
        {
            for (int i=0; i<chars1Copy.length;i++)
            {
                if(Objects.equals(words, charsCopy[i]))
                {
                     words= String.valueOf((chars1Copy[i]));
                }
            }
            System.out.print((Arrays.toString(word)) +" ");
        }
//        System.out.print(chars +" ");
//        System.out.println();
//        System.out.println("===============");
//        System.out.print(chars1 +" ");
}
}
