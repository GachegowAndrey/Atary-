import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingFile
{
    /*1.Считать с консоли имя файла.
      2. Вывести в консоли содержимое файла на экран
      3. Освоболить ресурсы. Закрыть поток чтения с файла и поток ввода с консоли
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile=reader.readLine();

        FileInputStream fileReader= new FileInputStream(nameFile);
        Scanner scanner = new Scanner(fileReader);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine())
        {
            builder.append(scanner.nextLine());
        }

        System.out.println(builder.toString());

        scanner.close();
        reader.close();
    }
}
