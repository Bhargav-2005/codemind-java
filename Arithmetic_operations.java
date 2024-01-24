import java.util.*;
public class Arith
{
    public static void main(String[] ven)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Sum:"+(m+n));
        System.out.println("Difference:"+(m-n));
        System.out.println("Product:"+(m*n));
        System.out.println("Quotient:"+(m/n));
        System.out.println("Remainder:"+(m%n));
    }
}