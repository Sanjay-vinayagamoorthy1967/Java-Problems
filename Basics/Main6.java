  import java.util.Scanner;

public class Main6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int mileage = sc.nextInt();
        int fuelPrice = sc.nextInt();
        int tollCharge = sc.nextInt();
        int dis = distance/mileage;
        int tot = dis*fuelPrice;
        int total = tot+tollCharge;
        System.err.println(total);
    }
}


   