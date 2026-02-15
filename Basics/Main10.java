import java.util.Scanner;

public class Main10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deliveries = sc.nextInt();
        int payout = sc.nextInt();
        int incentive = sc.nextInt();
        int fuelCost = sc.nextInt();
        int NetEarnings = (deliveries * payout) + incentive - fuelCost;
        System.err.println(NetEarnings);  
    } 
}
