import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MilitaryTime
{
    /*You want to convert the time from a 12 hour clock to a 24 hour clock.
    If you are given the time on a 1 hour clock,
     you should output the time as it would appear on a 24 hour clock.
     Task
     Determine if the time you are given as AM ot PM,
     then convert that value to the way that it would appear on a 24 hour clock
     Input
     A string that includes the time, then a space and the indicator for AM or PM.
     Output
     A  string that includes the time in a 24 hour format(XX XX)
     Sample
     I
     1:15 PM
     O
     13:15
     Explanation
     1:00 Pm on a 12 hour clock is equivalent to 13 on a 24 hour clock.
     */
    public static void main(String[]args)throws Exception
    {
        Scanner read = new Scanner(System.in);
        String speak = read.nextLine();
        String[] date = speak.split("\\s+");
        if (date[1].equals("PM"))
        {
            String[] format  =date[0].split(":");
            int hour= Integer.parseInt(format[0]);
            hour+=12;
            if (hour==24)
            {
                hour= Integer.parseInt("00");
            }
           // int minutes=Integer.parseInt(format[1]);
            System.out.println(hour+":"+format[1]);
        }
        else
        {
            String[]format=date[0].split(":");
            if(format[0].equals("12"))
            {
                format[0]="12";
            }
            System.out.println(format[0]+":"+format[1]);
        }

    }
}
