import java.util.Scanner;

public class PasswordValidation
{
    /*You're interviewing to join a security team.
    They want to see you build a password evaluator for your technical interview to validate the input.
    Task
    Write a program that takes in a string as input and evaluates it as a valid password.
    The password  is valid if it has at a minimum 2 numbers of the following special characters
    ('!','@', '#','$','%','&','*',),and a length of at least 7 characters.
    If the password passes the check , output "Strong", else output "Weak".
    InputF
    A string representing the password to evaluate.
    OutputF
    A string that says "Strong" if the input meets the requirements , or "Weak", if not.
    Sample Input
    Hello@$World19
    Sample Output
    Strong
    Explanation
    The password has 2 numbers, 2 of the defined special characters, and its length is 14, making it valid.
     */
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String password =read.nextLine();

        int character=0;
        int number=0;

        String [] characters={"!","@", "#","$","%","&","*"};
        String [] numbers ={"1","2","3","4","5","6","7","8","9","0"};

        for (int i=0;i<characters.length;i++)
        {
            if (password.contains(characters[i]))
            {
                character++;
            }
        }
        for (int i=0;i<numbers.length;i++)
        {
            if (password.contains(numbers[i]))
            {
                number++;
            }
        }
        if (password.length()>=14&&character>=2&&number>=2)
        //(password.length()>=14&&character>=1&&number>=1) valid
        {
            System.out.println("Strong");
        }
        else
        {
            System.out.println("Weak");
        }
    }
}
