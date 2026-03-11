import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr= new int[r][c];
        int[][] mat1 = new int[r][c];
        int[][] result = new int[r][c];
        System.out.println("Matrix 1: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();  
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat1[i][j] = sc.nextInt(); 
                System.out.print(mat1[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("Sum Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j]=mat1[i][j]+arr[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
