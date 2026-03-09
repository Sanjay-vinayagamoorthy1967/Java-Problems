import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][]arr1 = new int[r][c];
        int [][]arr2 = new int[r][c];
        int [][] result = new int[r][c];
        System.out.println("Matrix A:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j] = sc.nextInt();
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix B:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j] = sc.nextInt();
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum (A + B):");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();        
    }
}
