import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialBalance = sc.nextDouble();
        int n = sc.nextInt();
        int count=0,count1=0;
        double TotalWithdrawn = 0;
        for(int i=1;i<=n;i++){
            double withdrawalAmount = sc.nextDouble();
            String status = "0";
            if(withdrawalAmount <= initialBalance){
                status = "Approved";
                initialBalance = initialBalance-withdrawalAmount;
                count++;
                TotalWithdrawn = TotalWithdrawn+withdrawalAmount;
            }else{
                status = "Denied";
                count1++;
            }
            System.out.println();
            System.out.println("Transaction"+i+": $"+withdrawalAmount);
            System.out.println("Status: "+status);
            if(status.equals("Denied")){
                System.out.println("Reason: Insufficient funds");
            }
            System.out.println("Remaining Balance: $"+initialBalance);
        }
            System.out.println();
            System.out.println("Total Transactions: "+n);
            System.out.println("Successful Withdrawals: "+count);
            System.out.println("Failed Withdrawals: "+count1);
            System.out.println("Final Balance: $"+initialBalance);
            System.out.println("Total Withdrawn: $"+TotalWithdrawn);
            sc.close();
    }
}
