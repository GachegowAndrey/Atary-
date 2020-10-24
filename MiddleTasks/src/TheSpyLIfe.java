import java.util.Scanner;

public class TheSpyLIfe
{
     /*You are a secret agent, and you received a encrypted message that needs to be decorated.
    The code that is being used flips the message backwards
    and inserts non-alphabetic characters in thr message to make it hard to decipher.
    task
    Create a program that will take the encode message, flip it around, remove any characters
    that are not a letter or a space, and output the hidden message
    Input
    A string of characters that represent the encode message.
    Output
    A string of character that represent the intend secret message.
    Explanation
    If you remove everything that isn't a letter or space from original message
    and flip it around, you get a "Hello World"(d89%l++5r19o7^W *o=l645le9H)

     */
     public static void main(String[] args)
     {
          Scanner read1 = new Scanner(System.in);//включение сканера
          String s = read1.nextLine();//ввод данных
          //String s = "132 12 3 153 371";
          int len = s.length();
          // int len = s.length();
          char[] tempCharArray = new char[len];
          char[] charArray = new char[len];
          //создадим из строки
          // массив символов
          for (int i = 0; i < len; i++) {
               tempCharArray[i] = s.charAt(i);}
          // palindrome.charAt(i);}
          // перевернем массив символов
          for (int j = 0; j < len; j++) {
               charArray[j] = tempCharArray[len-1-j];}
          String reversePalindrome = new String(charArray);

          String[] word = reversePalindrome.split(" ");


          for (String word1:word)
          {
               System.out.print(word1.replaceAll("[^A-z&&[^^']]","")+" ");
          }
     }
}
