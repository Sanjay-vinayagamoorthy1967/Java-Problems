import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Balance = sc.nextInt();
        int widthrawl = sc.nextInt();
        boolean transaction = true;
        do{
            System.out.println("Balance: "+Balance);
            System.out.println("Enter withdrawal amount: "+widthrawl);
            if(widthrawl>Balance){
                System.out.println("Insufficient funds! Try again.");
                widthrawl = sc.nextInt();
            }else if(widthrawl<=100){
                System.out.println("Invalid amount! Try again."); 
                widthrawl = sc.nextInt();
            }else if(widthrawl<Balance){
            int num = Balance-widthrawl;
            System.out.println("Withdrawal successful! Remaining balance: "+num);
            transaction = false;
            }
            
        }while(transaction);
        sc.close();
    }
}
