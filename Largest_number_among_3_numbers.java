import java.util.*;
public class Largest{
    public static void main(String[] ven){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println(Math.max(Math.max(n1,n2),n3));
        
    }
}