import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Original Image:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Adjusted Image: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]+n>255){
                    System.out.print("255 "); 
                }else{
                    System.out.print(arr[i][j]+n+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
