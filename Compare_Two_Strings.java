import java.util.*;
public class EqualStrings
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2=sc.next();
        if(str.equals(str2)){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }
    }
}