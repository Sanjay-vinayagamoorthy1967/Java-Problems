import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();
        int price = sc.nextInt();
        int serviceCharges = sc.nextInt();
        int commission = sc.nextInt();
        int Revenue = (rooms * price) + serviceCharges - commission;
        System.err.println(Revenue);  
    } 
}
