import java.io.*;
/*Програама вводит два имени файла.
И копирует первый файл на место заданного вторым именем.
 */
public class FileCopingUpdate
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();//ввод первого файла

        InputStream fileInputStream = null;


       // InputStream fileInputStream = getInputStream(sourceFileName);
        try
        {
            fileInputStream=getInputStream(sourceFileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File is not exist");
            sourceFileName=reader.readLine();
            fileInputStream=getInputStream(sourceFileName);
        }
        String destinationFileName= reader.readLine();//ввод второго файла
        OutputStream fileOutputStream =getOutputStream(destinationFileName);

        int count =0;
        while (fileInputStream.available()>0)
        {
            int data =fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }
        System.out.println("Скопировано байт "+count);
        fileInputStream.close();
        fileOutputStream.close();
    }
    public static InputStream getInputStream(String fileName) throws FileNotFoundException {
        return new FileInputStream(fileName);
    }
    public static OutputStream getOutputStream(String fileName) throws FileNotFoundException {
        return new FileOutputStream(fileName);
    }
}
