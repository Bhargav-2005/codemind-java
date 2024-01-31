import java.util.*;
public class Grdes{
    public static void main(String[] ven){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int cs=sc.nextInt();
        int tot=p+c+b+m+cs;
        int avg=tot/5;
        if(avg>=90){
            System.out.println("Grade A");
        }
        else if(avg>=80){
            System.out.println("Grade B");
        }
        else if(avg>=70){
            System.out.println("Grade C");
        }
        else if(avg>=60){
            System.out.println("Grade D");
        }
        else if(avg>=50){
            System.out.println("Grade E");
        }
        
        else{
            System.out.println("Grade F");
        }
    }
}