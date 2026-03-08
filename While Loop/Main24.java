import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int l = 0;
        if(n>n1){
            l = n;
        }else{
            l = n1;
        }
        int result = 0;
        int i = 1;
        while(i<l){
            if(n%i==0 && n1%i==0){
                result = i;
            }
            i++;
        }
        System.out.println("HCF of "+n+" and "+n1+" = "+result);
        sc.close();
    }
}
