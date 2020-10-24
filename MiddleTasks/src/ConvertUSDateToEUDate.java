import java.util.Objects;
import java.util.Scanner;

public class ConvertUSDateToEUDate
{
    /*You and your friends are going to Europe! You have made plans to travel around Europe with your friends,
    but one thing you need to take into account so tha everything goes according to play,
     is that the format of their date is different that from what is used in the United States.
     Your job is to convert  all your dates from MM/DD/YYYY to DD/MM/YYYY.
     Task
     Create a function that takes in a string containing a date that is in Us format,
     and return a string of the same date converted to Eu.
     InputF
     A string that contains a date formatting 11/19/2019 or November 19, 2019.
     OutputF
     A string of the same date but in a different format: 19/11/2019.
     SampleI
     7/26/2019
     SampleO
     26/7/2019
     Note, the the input can be in two different formats, 11/19/2019 or November 19,2019

     */
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String speak = read.nextLine();
        String[] numbersD= {"1","2", "3","4","5","6","7","8","9","10","11","12" };
        String[] months = {"January", "February", "March", "April","May","June","July","August","September","October","November","December"};
        if(speak.contains("/"))
        {
            String[] date = speak.split("/");
            System.out.println(date[1]+"/"+date[0]+"/"+date[2]);
        }
        else
        {
            String[] date = speak.split("\\s+");
                for (int i=0; i<numbersD.length;i++)
                {
                    if(Objects.equals(date[0], months[i]))
                    {
                        date[0]=(numbersD[i]);
                    }
                }
            System.out.println(date[1].replaceAll("[^0-9]","")+"/"+date[0]+"/"+date[2]);
        }

    }
}
