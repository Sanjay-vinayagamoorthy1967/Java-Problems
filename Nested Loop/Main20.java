import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] N= new int[r][c]; 
        int [][] T= new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                N[i][j] = sc.nextInt();
                T[j][i] = N[i][j];
            }
        }
        System.out.println("Original Matrix ("+r+" x "+c+"):");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(N[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed Matrix ("+c+" x "+r+"):");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(T[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
