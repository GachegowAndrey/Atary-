import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sorting
{
    /*1.Ввести имя файла с консоли.
      2.Прочитать из него набор чисел.
      3.Вывести в консоли тоьлко четные,
      отсортированные по возрастанию.
     */


    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        List<Integer> data= new ArrayList<Integer>();

        while (scanner.hasNext())
        {
            int value = scanner.nextInt();
            if (value%2==0)data.add(value);
        }

        Collections.sort(data);

        for (Integer value :data)
        {
            System.out.println(value);
        }
        scanner.close();
        fileInputStream.close();
    }

}
