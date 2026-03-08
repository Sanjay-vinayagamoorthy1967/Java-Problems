import java.util.Scanner;
public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int temp = n;
        int result = 0;
        while(n<=n1){
            if(n%2==0){
                result += n;  
            }
            n++;
        }
        System.out.println("Sum of even numbers from "+temp+" to "+n1+": "+result);
        sc.close();
    }
}
