import java.util.*;
public class LastIndex
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        while(n>0){
            if(arr[n-1]%2==0){
                System.out.println(arr[n-1]);
                c++;
                break;
            }
            n--;
        }
        if(c==0){
            System.out.println("NO");
        }
    }
}