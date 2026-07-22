import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==arr[j][i]){
                    continue;
                }else{
                    num = 2;
                    break;
                }
            }
        }
        if(num==1){
            System.out.print("True");
        }else{
            System.out.print("False");
        }

    }
}
