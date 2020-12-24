import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//наибольший общий делитель
public class NOD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int first=Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());

        System.out.println(getNod(first,second));
    }

    private static  int getNod(int first, int second){
        if (first<1||second<1){
            throw new IllegalArgumentException();
        }
        while (first!=second){
            if (first>second){
                first-=second;
            }
            if (second>first){
                second-=first;
            }

        }
        return first;
    }
}
