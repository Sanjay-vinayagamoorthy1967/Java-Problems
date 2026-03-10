import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [] [] M = new int[n][n];
        int mc = 0;
        int Mc = n-1;
        int mr = 0;
        int Mr = n-1;
        int num = 1;
        while(num<=(n*n)){
            for(int i=mc;i<=Mc;i++){
                M[mr][i] = num++;
            }
            for(int i=mr+1;i<=Mr;i++){
                M[i][Mc] = num++;
            }
            for(int i=Mc-1;i>=mc;i--){
                M[Mr][i] = num++;
            }
            for(int i=Mr-1;i>=mr+1;i--){
                M[i][mc] = num++;
            }
            mc++;
            mr++;
            Mc--;
            Mr--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(M[i][j]+" ");
               
            }
            System.out.println();
        }
        sc.close();
    }
}
