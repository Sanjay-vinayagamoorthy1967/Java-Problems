import java.util.Scanner;
public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int i = 1;
        int result = 0;
        do{
            result = n*i;
            System.out.println(n+" x "+i+" = "+result);
            i++;
        }while(i<=n1);
        sc.close();
    }
}
