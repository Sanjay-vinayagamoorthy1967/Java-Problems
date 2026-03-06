import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int temp = n1;
        int result = 1;
        while(n1>0){
            result = result*n;
            n1--;
        }
        System.out.println(n+"^"+temp+" = "+result);
        sc.close();
    }
}
