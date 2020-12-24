import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*Программа вводит с клавиатуры пару (число и строку)
и выводит  их на экраню
Нужно сделать так, чтобы программа вводила с клавиатуры пару(число и строку)
и сохраняла их в HashMap.

Требования.
Пустая строка-конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны повторяться.

Затем программа должна выводить содержание HAshMap на экраню
Каждую пар с новой строки.
 */
public class Functionally
{
    public static  void main(String []args ) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Integer> map=new HashMap<>();
        while (true)
        {
            String number=reader.readLine();
            if (number.isEmpty())
            {
                break;
            }
            int id=Integer.parseInt(reader.readLine());
            String name=reader.readLine();
            map.put(name,id);
        }

        for (Map.Entry<String,Integer> entry :map.entrySet() )
        System.out.println(entry.getKey()+" "+entry.getValue());

    }


}
