public class MethodMaximum
{
    /*
    Написать public static методы: int max(int, int), long max (long,long), double max(double,double).
    Каждый метод должен возвращать максимальное из двух переданных в него чисел

     */
    public static void main(String[] args) {

    }

    public static int min(int x, int y)
    {
        return  x>y?x:y;
    }
    public static long min(long a, long b)
    {
        return Math.max(a, b);
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
