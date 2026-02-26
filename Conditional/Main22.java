import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitsConsumed = sc.nextInt();
        String customerType = sc.next();
        String season = sc.next();
        String paymentMethod = sc.next();
        double tier1 = 0;
        double tier2 = 0;
        double tier3 = 0;
        double tier4 = 0;

        if (customerType.equals("Residential")) {
            int num3 = unitsConsumed;
            if (num3 > 100) {
                tier1 = 100 * 0.10;
            } else {
                tier1 = num3 * 0.10;
            }
            int num2 = unitsConsumed - 100;
            if (num2 > 200) {
                tier2 = 200 * 0.15;
            } else {
                tier2 = num2 * 0.15;
            }
            if (unitsConsumed > 300) {
                int num1 = unitsConsumed - 300;
                if (num1 > 200) {
                    tier3 = 200 * 0.25;
                } else {
                    tier3 = num1 * 0.25;
                }
            } else {
                tier3 = 0;
            }
            if (unitsConsumed > 500) {
                int num = unitsConsumed - 500;
                tier4 = num * 0.30;
            } else {
                tier4 = 0;
            }
        }
        if (customerType.equals("Commercial")) {

            int num3 = unitsConsumed;
            if (num3 > 100) {
                tier1 = 100 * 0.12;
            } else {
                tier1 = num3 * 0.12;
            }

            int num2 = unitsConsumed - 100;
            if (num2 > 200) {
                tier2 = 200 * 0.18;
            } else {
                tier2 = num2 * 0.18;
            }

            int num1 = unitsConsumed - 300;
            if (num1 > 200) {
                tier3 = 200 * 0.25;
            } else {
                tier3 = num1 * 0.25;
            }

            int num = unitsConsumed - 500;
            tier4 = num * 0.25;
        }

        if (customerType.equals("Industrial")) {

            int num3 = unitsConsumed;
            if (num3 > 100) {
                tier1 = 100 * 0.08;
            } else {
                tier1 = num3 * 0.08;
            }

            int num2 = unitsConsumed - 100;
            if (num2 > 200) {
                tier2 = 200 * 0.12;
            } else {
                tier2 = num2 * 0.12;
            }

            int num1 = unitsConsumed - 300;
            if (num1 > 200) {
                tier3 = 200 * 0.20;
            } else {
                tier3 = num1 * 0.20;
            }

            int num = unitsConsumed - 500;
            tier4 = num * 0.20;

        }

        int SeasonalAdjustment = 0;
        if (season.equals("Summer")) {
            SeasonalAdjustment = 15;
        } else if (season.equals("Winter")) {
            SeasonalAdjustment = -10;
        } else if (season.equals("Regular")) {
            SeasonalAdjustment = 0;
        }
        int PaymentDiscount = 0;
        if (paymentMethod.equals("Auto-Pay")) {
            PaymentDiscount = 5;
        } else if (paymentMethod.equals("Online")) {
            PaymentDiscount = 3;
        } else if (paymentMethod.equals("Manual")) {
            PaymentDiscount = 0;
        }
        double calculate = tier1 + tier2 + tier3 + tier4;
        double total = calculate + SeasonalAdjustment;
        double Averagerate = total / unitsConsumed;
        System.out.println("Units Consumed: " + unitsConsumed + "kWh");
        System.out.println("Customer Type: " + customerType);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Tier 1 Cost (0-100): $" + tier1);
        System.out.println("Tier 2 Cost (101-300): $" + tier2);
        System.out.println("Tier 3 Cost (301-500): $" + tier3);
        System.out.println("Tier 4 Cost (501+): $" + tier4);
        System.out.println("Seasonal Adjustment: " + SeasonalAdjustment + "%");
        System.out.println("Payment Discount: " + PaymentDiscount + "%");
        System.out.println("Total Bill: $" + total);
        System.out.println("Average Rate: $" + Averagerate + "kWh");
        sc.close();
    }
}
