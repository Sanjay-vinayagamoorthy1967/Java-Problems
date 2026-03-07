import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        int num = 1;
        int result =0;
        while(sum!=0){
            int dig = sum%10;
            if(dig==1){
                result += num;
            }
            num = 2*num;
            sum=sum/10;
        }
        System.out.println("Binary: "+n);
        System.err.println("Decimal: "+result);
        sc.close();
    }
}
