import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
 */
public class RamaWashing
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String speak = reader.readLine();

        String result = "";
        char[] chars=speak.toCharArray();
        for (int i=0;i<chars.length;i++)
        {
            char character = (i==0||chars[i-1]==' ')? Character.toUpperCase(chars[i]):chars[i];
            result+=character;
        }
        System.out.println(result);
    }
}
