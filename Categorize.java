import java.util.*;
public class Height{
    public static void main(String[] ven){
        Scanner sc=new Scanner(System.in);
        float height=sc.nextFloat();
        if(height<150){
            System.out.println("Person is Dwarf.");
        }
        else if(height>150 & height<=165){
            System.out.println("Person is average heighted.");
        }
        else if(165<height & height<=195){
            System.out.println("Person is taller.");
        }
        else{
            System.out.println("Abnormal height.");
        }
    }
}