import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieFactory
{
    public static void main(String args []) throws IOException
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        String key=null;
        while ((key=reader.readLine())!=null)
        {
            Movie movie = MoviesFactory.getMovie(key);
            if (movie==null)
            {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MoviesFactory
    {
        static Movie getMovie(String key)
        {
            Movie movie = null;
            if ("soapOpera".equals(key))
            {
                movie=new SoapOpera();
            }
            if ("cartoon".equals(key))
            {
                movie=new Cartoon();
            }
            if ("thriller".equals(key))
            {
                movie=new Thriller();
            }
            return  movie;
        }
    }

    static class Cartoon extends Movie
    {

    }

    static class Thriller extends Movie
    {

    }

    static abstract class Movie
    {

    }

    static class SoapOpera extends Movie
    {

    }


}
