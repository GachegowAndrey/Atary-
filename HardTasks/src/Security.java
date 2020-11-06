import java.util.Scanner;

public class Security
{
    /*You are in charge of security at a casino,
     and there is a thief who is trying to steal the casino's money!
     Look over the security diagrams to make sure that you always have
      a guard between the thief and the money!
      There is one money location, one thief , and any number of guards on each floor of the casino.
      Task
      Evaluate a given floor of the casino to determine if there is a guard between the money
      and the  thief, if there is not , you will sound an alarm.
      InputF
      A string of characters that includes $(money),T(thief),and G(guards),
       that represents the layout of the casino floor.
       Spaces oon the casino floor that is bot Occupied by either money, the thief ,
        or a guards is represented by the character x.
        OutputF
        A string that says "ALARM" is the money is in a danger or "quiet" if the money is safe
        SampleInput
        xxxxxGxx$xxxT
        SampleOutput
        ALARM
        Explanation
        This input should set off the alarm because there is no guard between the money and the thief!
     */
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String string =read.nextLine();
       // String [] strings=string.split("");
        String string1=string.replaceAll("x","");
        System.out.println(string1);
        if (string1.contains("$T")||string1.contains("T$"))
        {
            System.out.println("Alarm");
        }
        else
        {
            System.out.println("quiet");
        }
    }
}
