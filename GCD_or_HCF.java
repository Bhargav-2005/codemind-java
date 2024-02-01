import java.util.*;
public class GCD
{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=0,c=Math.min(a,b);
        for(int i=1;i<=c;i++){
            if(a%i==0 & b%i==0){
                gcd=i;
            }
        }
         System.out.println(gcd);
    }
}
