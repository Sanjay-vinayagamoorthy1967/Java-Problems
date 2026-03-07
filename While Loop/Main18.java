import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int sum = 0;
        int result = 0;
        if(n>n1){
            sum = n;
        }else{
            sum = n1;
        }
        int i = 1;
        while(i<sum){
            if(n%i==0 && n1%i==0){
                result = i;
            }
            i++;
        }
        System.out.println(n*n1/result);
        sc.close();
    }
}
