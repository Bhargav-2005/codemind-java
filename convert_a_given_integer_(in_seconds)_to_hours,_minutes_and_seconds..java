import java.util.*;
public class Arith
{
    public static void main(String[] ven)
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int hr=h/3600;
        int m=h%3600;
        int ms=m/60;
        int s=m%60;
        System.out.println("H:M:S-"+hr+":"+ms+":"+s);
    }
}