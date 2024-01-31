import java.util.*;
public class Salary{
    public static void main(String[] ven){
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        float da,hra;
        if(sal<=10000){
            da=(80*sal)/100;
            hra=(20*sal)/100;
        }
        else if(sal<=20000){
            da=(90*sal)/100;
            hra=(25*sal)/100;
        }
        else{
            da=(95*sal)/100;
            hra=(30*sal)/100;
        }
        System.out.printf("%.2f",sal+da+hra);
    }
}