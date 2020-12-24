public class MethodMinimum
{
    /*Написать public static методы: int min(int, int), long min (long,long), double min(double,double).
    Каждый метод должен возвращать минимальное из двух переданных в него чисел
     */
    public static void main(String[] args) {

    }

    public static int min(int x, int y)
    {
        if (x>y)
        {
            return y;
        }
        return  x;
    }
    public static long min(long a, long b)
    {
        if (a>b)
        {
            return b;
        }
        return  a;
    }

    public static double min(double c, double d)
    {
        if (c>d)
        {
            return d;
        }
        return  c;
    }


}
