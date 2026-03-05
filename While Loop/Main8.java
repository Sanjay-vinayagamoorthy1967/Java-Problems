import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int result = 0;
        while (n!=0) {
            int dig = n%10;
            result += dig;
            n = n/10;
        }
        System.out.println(result);
        sc.close();
    }
}
