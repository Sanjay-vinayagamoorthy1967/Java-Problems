import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double TotalDeposits = 0; 
        double TotalWithdrawals = 0;
        double TotalTransfers = 0;
        double TotalPayments = 0;
        double NetBalanceChange = 0;
        for(int i=1;i<=n;i++){
            String transactionType = sc.next();
            double amount = sc.nextDouble();
            String Category = "0";
            if(transactionType.equals("Deposit")){
                Category = "Credit";
                TotalDeposits +=amount;
            }else if(transactionType.equals("Withdrawal")){
                Category = "Debit";
                TotalWithdrawals += amount;
            }else if(transactionType.equals("Transfer")){
                Category = "Debit";
                TotalTransfers +=amount;
            }else if(transactionType.equals("Payment")){
                Category = "Debit";
                TotalPayments +=amount;
            }
            NetBalanceChange = TotalDeposits-(TotalWithdrawals+TotalTransfers+TotalPayments);
            System.out.println();
            System.out.println("Transaction "+i+": "+transactionType);
            System.out.println("Amount: $"+amount);
            System.out.println("Category: "+Category);
        }
            System.out.println();
            System.out.println("Total Transactions: "+n);
            System.out.println("Total Deposits: $"+TotalDeposits);
            System.out.println("Total Withdrawals: $"+TotalWithdrawals);
            System.out.println("Total Transfers: $"+TotalTransfers);
            System.out.println("Total Payments: $"+TotalPayments);
            System.out.println("Net Balance Change: $"+NetBalanceChange);
            sc.close();
    }

}
