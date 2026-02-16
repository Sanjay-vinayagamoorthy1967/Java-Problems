import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int rate = sc.nextInt();
        int maintenance = sc.nextInt();
        int allowance = sc.nextInt();
        int subsidy = sc.nextInt();
        int TransportFee = (distance * rate) + maintenance + allowance - subsidy;
        System.err.println(TransportFee);  
    } 
}
