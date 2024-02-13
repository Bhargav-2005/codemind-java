import java.util.*;
public class EleSmall
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int avg=sum/n;
        for(int i=0;i<n;i++){
            if(arr[i]<=avg){
                c++;
            }
        }
        System.out.println(c);
    }
}