import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(n!=0){
            int dig = n%10;
            rev = rev*10+dig;
            n=n/10;
        }
        if(temp==rev){
            System.out.println(temp+" is a Palindrome");
        }else{
            System.out.println(temp+" is not a Palindrome");
        }
        sc.close();
    }
}
