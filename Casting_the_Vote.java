import java.util.*;
public class Vote{
    public static void main(String[] ven){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>17){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}