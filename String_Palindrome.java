import java.util.*;
public class Palindrome
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length()-1;
        boolean isPalin=true;
        for(int i=0;i<(n/2);i++){
            if(str.charAt(i) != str.charAt(n-i)){
                isPalin=false;
                System.out.println("Not Palindrome");
               
                break;
            }
        }
        if(isPalin){
            System.out.println("Palindrome");
        }
        
    }
}