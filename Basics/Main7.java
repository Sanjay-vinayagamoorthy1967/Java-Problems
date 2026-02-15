import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysWorked = sc.nextInt();
        int wagePerDay = sc.nextInt();
        int overtimeBonus = sc.nextInt();
        int maintenanceCharge = sc.nextInt();
        int dis = daysWorked*wagePerDay;
        int tot = dis+overtimeBonus;
        int total = tot-maintenanceCharge;
        System.err.println(total);  
    } 
}
