import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2;
        for(int i=0;i<=mid;i++){
            for(int j=0;j<mid-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=mid-1;i>=0;i--){
            for(int j=0;j<mid-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
