import java.util.*;
public class LastIndex
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        boolean eleInArr=false;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           int f=sc.nextInt();
           for(int i=0;i<n;i++){
            if(arr[i]==f)
            eleInArr=true;
           }
       if(eleInArr)
       System.out.println("True");
       else
       System.out.println("False");
        }
       
}