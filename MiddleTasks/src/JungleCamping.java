import java.util.Scanner;

public class JungleCamping
{
    /*you are camping alone out in the  jungle and you  hear some animals in the dark nearby.
    Based on the noise  they make , determine  which animals they are.
    Task
    you are given the noises  made by different  animals  that you  can hear  in the dark, evaluate
    each noise  to determine which animal it belongs to. Lions say 'Grr', tigers say 'Rawr',
    Snakes say 'Ssss' and Birds say 'Grip'.
    input
    A string tha represent the noises that you hear with a space between them.
    output
    A string that includes each animals  that you hear with a space after each one . (animals can repeat)
    Explanation
    You heard the noise  made by  a tiger, then a bird , and then a snake.

     */
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String noise = read.nextLine();
        String[] words = noise.split("\\s+");
        String[] noises = {"Grr", "Rawr", "Ssss", "Chirp"};
        String[] animal= {"Lion", "Tiger", "Snake", "Bird", };
        for (String word : words)
        {
            for (int i=0; i<noises.length;i++)
            {
                if(word.equals(noises[i]))
                {
                    System.out.println(animal[i]+" ");
                }
            }
        }

    }
}
