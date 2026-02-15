import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roomCharge = sc.nextInt();
        int days = sc.nextInt();
        int medicineCost = sc.nextInt();
        int labFees = sc.nextInt();
        int insuranceCoverage = sc.nextInt();
        int FinalBill = (roomCharge * days) + medicineCost + labFees - insuranceCoverage;
        System.err.println(FinalBill);  
    } 
}
