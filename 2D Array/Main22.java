import java.util.Scanner;
public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[] result = new int[r*c];
        int mc = 0;
        int MC = c-1;
        int mr = 0;
        int MR = r-1;
        int index=0;
        int i=0;
        while(i<r*c){
            for(int j=mc;j<=MC;j++){
                result[index++] = arr[mr][j];
                i++;
            }
            for(int l=mr+1;l<=MR;l++){
                result[index++] = arr[l][MC];
                i++;
            }
            
            for(int m=MC-1;m>=mc;m--){
                result[index++] = arr[MR][m];
                i++;
            }
            for(int n=MR-1;n>=mr+1;n--){
                result[index++] = arr[n][mc];
                i++;
            }
            mr++;
            mc++;
            MC--;
            MR--;
        }
        System.out.println("Spiral Order:");
        for(int p=0;p<r*c;p++){
            System.out.print(result[p]+" ");
        }
         sc.close();
    }
}