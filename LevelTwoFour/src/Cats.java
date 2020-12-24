import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cats
{
    /*1. Считать строки с консоли, пока пользователь не введет пустую строку(Enter).
     2. Для каждого параметра(имени кота):
       создать объект cat класса Cat , который равен коту из getCatByKey(String параметр)
       вывести на экран cat.toString()
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        String key;

        while (!(key=reader.readLine()).equals(""))
        {
            Cat cat = CatFactory.getCatByKey(key);
            System.out.println(cat.toString());
        }
    }

    static class CatFactory
    {
        static Cat getCatByKey(String key)
        {
            Cat cat=null;
            switch (key)
            {
                case "vaska":
                    cat=new MaleCat("Vasiliy");
                    break;

                case "murka":
                    cat=new FemaleCat("Murchka");
                    break;

                case "kiska":
                    cat=new FemaleCat("Kisulka");
                    break;

                default:
                    cat=new Cat(key);
                    break;
            }
            return cat;
        }
    }


    static  class Cat
    {
        private String name;

        protected Cat(String name)
        {
            this.name=name;
        }

        public String getName()
        {
            return this.name;
        }

        public String toString()
        {
            return "Я уличный кот "+getName();
        }

    }

    static class MaleCat extends Cat
    {
        MaleCat(String name)
        {
            super(name);
        }
        public String toString()
        {
            return "Я солидный кошак по имени "+getName();
        }
    }


    static class FemaleCat extends Cat
    {
        FemaleCat (String name)
        {
            super(name);
        }
        public String toString()
        {
            return "Я милая кошечка по имени "+getName();
        }
    }



}
