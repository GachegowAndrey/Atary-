import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class FilesWriter
{
    /*
    1.Прочесть с консоли имя файла.
    2.Считать строки с консоли, пока пользователь не введет строку "exit".
    3.Вывести абсалютно все введенные строки в файл, каждую строчку с новой строки.
    */
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile=reader.readLine();


        BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile));
        StringBuilder builder = new StringBuilder();

        String content ="";
        while (!content.equals("exit"))
        {
            content=reader.readLine();
            builder.append(content).append("\n");
        }

//        FileOutputStream fileWriter= new FileOutputStream(nameFile);
//        Scanner scanner = new Scanner((Readable) fileWriter);
//        StringBuilder builder = new StringBuilder();

        writer.write(builder.toString());
        writer.close();

    }
}
