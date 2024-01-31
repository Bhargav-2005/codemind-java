import java.util.*;
public class RainFall{
    public static void main(String[] ven){
        Scanner sc=new Scanner(System.in);
        int mea=sc.nextInt();
        if(mea<3){
            System.out.println("LIGHT");
        }
        else if(mea>=3 & mea<7){
            System.out.println("MODERATE");
        }
        else{
            System.out.println("HEAVY");
        }
    }
}