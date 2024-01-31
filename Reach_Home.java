import java.util.*;
public class ReachHome{
    public static void main(String[] ven){
        Scanner sc=new Scanner(System.in);
        int lt=sc.nextInt();
        int dist=sc.nextInt();
        if(lt*5>=dist){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}