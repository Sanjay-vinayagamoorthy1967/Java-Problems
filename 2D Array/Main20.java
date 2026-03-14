import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[][] mat = new int[n][n];
        System.out.println("Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                mat[i][j] = arr[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        boolean found = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]!=mat[j][i]){
                    found = false;
                    break;
                }
            }
            System.out.println();
        }
        if(found){
            System.out.println("Status: Symmetric");
        }else{
            System.out.println("Status: Asymmetric");
        }
        sc.close();
    }
}
