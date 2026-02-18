import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int withdrawal = sc.nextInt();
        int limit = sc.nextInt();
        if(balance>=withdrawal && withdrawal<=limit){
            System.out.println("Approved");
        }else{
            System.out.println("Declined");
        }
    }
}
