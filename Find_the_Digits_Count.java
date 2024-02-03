import java.util.*;
public class DigitsCount{
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int c=s.length(),c1=0;
        // while(n>0){
        //     n/=10;
        //     c1++;
        // }
        System.out.println(c);
    }
}