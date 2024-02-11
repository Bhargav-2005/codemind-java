import java.util.*;
public class DiceWin{
    static boolean isprime(int n){
        int fact=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) fact++;
        }
        return (fact==2)?true:false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            n--;
            int A=sc.nextInt(),B=sc.nextInt();
            int sum=A+B;
            string str;
            if((isPrime(sum)){
                str="tevitt";
            }
            else str="Satya";
            System.out.println(str);
        }
    }
}