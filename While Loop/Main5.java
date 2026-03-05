import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev =0;
        while(n!=0){
            int dig = n%10;
            rev = rev*10+dig;
            n /= 10;
        }
        System.out.println("Original: "+temp);
        System.out.println("Reversed: "+rev);
        sc.close();
    }
}
