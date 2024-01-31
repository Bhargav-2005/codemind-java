import java.util.*;
public class Season{
    public static void main(String[] ven){
        Scanner sc=new Scanner(System.in);
        int mon=sc.nextInt();
        if(mon>3 &mon<7){
            System.out.println("Summer");
        }
        else if(mon>6 & mon<11){
            System.out.println("Rainy");
        }
        else if(mon==11 || mon==12 || mon==1){
            System.out.println("Winter");
        }
        else if(mon==2 || mon==3){
            System.out.println("Spring");
        }
        else{
            System.out.println("-1");
        }
    }
}