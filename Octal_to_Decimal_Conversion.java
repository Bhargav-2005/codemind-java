import java.util.*;
public class DecimalConv{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String oct=sc.next();
        int dec=Integer.parseInt(oct,8);
        System.out.println(dec);
    }
}