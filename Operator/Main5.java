import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  Salary = sc.nextInt();
        int CreditScore = sc.nextInt();
        if(Salary > 25000 && CreditScore > 700){
            System.out.println("Loan Approved");
        }else{
            System.out.println("Loan Rejected");
        }
    }
}
