import java.util.Scanner;
public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] sum = new int[n];
        int k=0;
        int number = 0;
        for(int i=0;i<n;i++){
            int num = 0;
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
                num += arr[i][j];
            }
            if(i==0){
                number = num;
            }
            sum[k++] = num;
        }

        int[] sum1 = new int[n];
        int k1=0;
        for(int i=0;i<n;i++){
            int num = 0;
            for(int j=0;j<n;j++){
                num += arr[j][i];
            }
            sum1[k1++] = num;
        }
        boolean found = true;
        for(int i=0;i<k;i++){
            for(int j=0;j<k1;j++){
                if(sum[i]!=sum1[j]){
                    found = false;
                    break;
                }
            }

        }
        if(found){
            System.out.println("Result: Magic Square");
            System.out.println("(Constant: "+number+")");
        }else{
            System.out.println("Result: Not Magic Square");
            System.out.println("(Constant: "+number+")");

        }
        sc.close();
    }
}
