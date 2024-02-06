import java.util.*;
public class MatrixAdd{
    public static void main(String[] adt){
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] ar1=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                ar1[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] ar2=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                ar2[i][j]=sc.nextInt();
            }
        }
        int[][] ar3=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                ar3[i][j]=ar1[i][j]+ar2[i][j];
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(ar3[i][j]+" ");
            }
            System.out.print("
");
        }
    }
}