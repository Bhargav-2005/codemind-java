import java.util.*;
public class CountInArray
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),even=0,odd=0;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            if(ar[i]%2==0){
                even++;
            }
            else odd++;
        }
        
        System.out.println(even+" "+odd);
    }
}