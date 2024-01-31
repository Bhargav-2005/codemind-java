import java.util.*;
public class Electricity{
    public static void main(String[] ven){
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();
        String name=sc.nextLine();
        int un=sc.nextInt();
        if(un<=199){
            System.out.printf("%.2f",(float)(un*1.20)+100);
        }
        else if(un<400){
            System.out.printf("%.2f",(float)(un*1.50)+100);
        }
        else if(un<600){
            System.out.printf("%.2f",((float)(un*1.80))+(15*un*1.8)/100);
        }
        else{
            System.out.printf("%.2f",((float)(un*2))+(15*un*2)/100);
        }
    }
}