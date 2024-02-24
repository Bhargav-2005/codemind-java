import java.util.*;
public class TwoDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%100<10){
            System.out.println("0"+year%100);
        }
        else
        System.out.printf("%2d",year%100);
    }
}