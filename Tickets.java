import java.util.*;
public class TicketCost
{
    public static void main(String[] adt){
        Scanner sc=new Scanner(System.in);
        int cost=sc.nextInt();
        if(cost*4<=1000){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}