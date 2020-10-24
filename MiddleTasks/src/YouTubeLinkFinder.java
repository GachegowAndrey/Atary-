import java.util.Scanner;

public class YouTubeLinkFinder
{
    /*
    You and your friends like to share YouTube links all throughout the day.
    You want  to keep track of all the video you watch in your own personal notepad,
    but you find that keeping the entire link is unnecessary.
    Keep the video ID(the combination of letters and numbers at the end of the link)
    in your notepad to slim down the URL.
    Task
    Create a program tha parses through a link, extracts and outputs the YouTube video ID.
    Input
    A string containing the URL to a YouTube video.
    The format of the string can be in
    "http://www.youtube.com/watch?v=kbxkq_w51PM" or the shortened
    "https://youtu.be/KMBBjzp5hdc" format.
    Output
    A string containing the extracted YouTube video id.
    SAmple Input
    http://www.youtube.com/watch?v=RRW2aUSw5vU
    Sample Output
     RRW2aUSw5vU
     Explanation
     Note that the input can be in two different formats
     */
    public static void main(String[]args)throws Exception
    {
        Scanner read = new Scanner(System.in);
        String speak = read.nextLine();
        if(speak.contains("//www"))
        {
            String [] link=speak.split("=");
            System.out.println(link[1]);
        }
        else
        {
            String [] link=speak.split("/");
            System.out.println(link[3]);
        }
    }
}
