import java.util.*;
public class Grades
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int h1=sc.nextInt(),sn=sc.nextInt(),sd=sc.nextInt();
        if(h1>50 & sn>60 & sd>100){
            System.out.println("10");
        }
        else if(h1>50 & sn>60){
            System.out.println("9");
        }
        else if(sd>100 & sn>60){
            System.out.println("8");
        }
        else if(h1>50 & sd>100){
            System.out.println("7");
        }
        else if(h1>50 || sn>60 || sd>100){
            System.out.println("6");
        }
        else{
            System.out.println("5");
        }
    }
}