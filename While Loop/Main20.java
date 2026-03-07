import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int result = 0;
        int fact = 1;
        while(n!=0){
            int dig = n%10;
            while(dig!=0){
                fact =dig*fact;
                dig--;
            }
            result = result+fact;
            fact = 1;
            n=n/10;
        }
        if(result==temp){
        System.out.println(temp+" is a strong number.");
        }else{
            System.out.println(temp+" is not a strong number.");
        }
        sc.close();
    }
}
