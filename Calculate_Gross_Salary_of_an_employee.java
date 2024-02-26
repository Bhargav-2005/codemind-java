import java.util.*;
public class SalaryEmp
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float bas=sc.nextFloat();
        float hra=sc.nextFloat();
        float da=sc.nextFloat();
        float pf=(12*bas)/100;
        System.out.printf("%.2f
%.2f",pf,bas+hra+da+pf);
    }
}