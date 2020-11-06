import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NewDriverLicense
{
    /*You have to get a new driver's license and you show up at the office at the same time as 4 other people.
    The office says that they will see everyone in alphabetical order
     and it takes 20 minutes for them to process each new license.
    All of the agents are available now, and they can each see one customer at a time.
    How long will it take for you to walkout of the office with your new license?
    Task
    Given everyone's name that showed up at the same time,
     determine how long it will take to get your new license.
    InputF
    Your input will be a string of your name, then an integer of the number of available agents,
    and lastly a string of the other four names separated by spaces.
    OutputF
    You will output an integer of the number of minutes that it wil take to get your license.
    Sample Input
    "Eric"
    2
    "Adam Caroline Rebecca Frank"
    Sample Output
    40
    Explanation
    It will take 40 minutes to get your license
     because you are in the second group of two be seen by one of the two  available agents.
     (Zebedian 1 Bob Jim Becky Pat -> 100 (20*5))
     (AAron 1 Jane Olivia Sam -> 20 (20*1)
     */
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String yourName =read.nextLine();
        String countOfAgents = read.nextLine();
        String otherPeople = read.nextLine();

        int id=5;

         String[] listNames=otherPeople.split(" ");
        ArrayList<String> otherPeople1 = new ArrayList<>(Arrays.asList(listNames));
        otherPeople1.add(yourName);
        Collections.sort(otherPeople1);
        int myPosition = otherPeople1.indexOf(yourName)+1;
       // String[] listNames=otherPeople.split("\\s+");
//        char[] charY=yourName.toCharArray();
//        char[] char1=listNames[0].toCharArray();
//        char[] char2=listNames[1].toCharArray();
//        char[] char3=listNames[2].toCharArray();
//        char[] char4=listNames[3].toCharArray();
//
//        if (charY[0]<char1[0])
//        {
//            id=id-1;
//        }
//        if (charY[0]<char2[0])
//        {
//            id=id-1;
//        }
//        if (charY[0]<char3[0])
//        {
//            id=id-1;
//        }
//        if (charY[0]<char4[0])
//        {
//            id=id-1;
//        }

      /*agents position time
        1      1=20 2=40 3=60 4=80 5=100 ag*pos*time 1*1
        2      1=20 2=20 3=40 4=40 5=60  ag*pos*time-() 2*1   2*20+pos/2*time
        3      1=20 2=20 3=20 4=40 5=40
        4      1=20 2=20 3=20 4=20 5=40
       */
      //pos*time -(pos-ag-1*time)   (pos-ag)*20
        /* 1  2  3  4  5  (pos-ag+1)*20
        1 20 40 60 80 100  1 2 3 4 5 pos*time
        2 20 20 40 40 60   1 1 2 2 3 pos/2*time  ag-pos ag/pos pos-ag pos-ag
        3 20 20 20 40 40   1 1 1 2 2 pos/3*time
        4 20 20 20 20 40   1 1 1 1 2 pos/4*time  pos*ag*time-((pos-1)/ag)*time-((ag-1)/pos)*time
         */
        //pos*ag(pos-ag)(ag-pos)(ag/pos)+(ag/pos)+(pos/ag)
        //pos*time *(pos-(pos/ag))

        int pos=myPosition;
        int ag=Integer.parseInt(countOfAgents);
        int minute=(id/Integer.parseInt(countOfAgents));
        int minutes=(myPosition-(Integer.parseInt(countOfAgents)/myPosition-1))*20;
        int min=myPosition/ag;
        int a = 0;
        do {
            pos -= ag;
            a++;
        } while (pos>0);
        System.out.println(a*20);
      //  print(int(client.index(name)//agent)*20 + 20)



    }
}
