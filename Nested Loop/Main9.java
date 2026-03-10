import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = i;
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print(k+1);
                num = num+k;
            }
            for(int l=0;l<i;l++){
                System.out.print(sum);
                sum = sum-1;
            }
            
            System.out.println();
        }
        sc.close();
    }
}
