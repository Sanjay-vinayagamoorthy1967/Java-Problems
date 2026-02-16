import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticketRevenue = sc.nextInt();
        int snackRevenue = sc.nextInt();
        int maintenance = sc.nextInt();
        int electricity = sc.nextInt();
        int NetProfit = ticketRevenue + snackRevenue - maintenance - electricity;
        System.err.println(NetProfit);  
    } 
}
