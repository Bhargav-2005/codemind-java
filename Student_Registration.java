import java.util.*;
public class StudentRegistration
{
    public static void main(String[] adt){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            if((n+k)<=m){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}