import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] original = new int[n][n];
        int[][] rotated = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                original[i][j] = sc.nextInt();
            }
        }
    System.out.println("Original Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }

        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-1-i] = original[i][j];
            }
        }
        System.out.println("Rotated Matrix (90 deg clockwise):");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(rotated[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
