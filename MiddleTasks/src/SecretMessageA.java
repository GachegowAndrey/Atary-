import java.util.*;
class caesarci
{
    public static void main(String args[])
    {
    String s;
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    char c[] = s.toCharArray();
    int l = s.length();
    int i = 0;
    for(i=0;i<l;i++)
     {
        
        int d;
        d = (int)c[i];
        if (d == 32)
        {
            continue;
        }
        if(d < 91)
        {
            c[i] = (char)(d + 32);
        }
        d = (int)(25+'a')-c[i];
        d = d + 'a';
        
        if(d >= 123)
        {
            d = d - 26;
        }
        c[i] = (char)d;
    
    }    
    System.out.println(c);
 }
}
