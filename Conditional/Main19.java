import java.util.Scanner;
public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieFormat = sc.next();
        String showTime = sc.next();
        String seatCategory = sc.next();
        String customerType = sc.next();
        double BaseTicketPrice=12;
        double FormatSurcharge = 0;
        if(movieFormat.equals("2D")){
            FormatSurcharge = 0;
        }else if(movieFormat.equals("3D")){
            FormatSurcharge = 5;
        }else if(movieFormat.equals("IMAX")){
            FormatSurcharge = 8;
        }else if(movieFormat.equals("4DX")){
            FormatSurcharge = 10;
        }
        double SeatUpgradeFee = 0;
        if(seatCategory.equals("Standard")){
            SeatUpgradeFee = 0;
        }else if(seatCategory.equals("Premium")){
            SeatUpgradeFee = 4;
        }else if(seatCategory.equals("Recliner")){
            SeatUpgradeFee = 7;
        }
        int TimeBasedAdjustment=0;
        if(showTime.equals("Matinee")){
            TimeBasedAdjustment = -30;
        }else if(showTime.equals("Evening")){
            TimeBasedAdjustment = 0;
        }else if(showTime.equals("Prime-Time")){
            TimeBasedAdjustment = 20;
        }else if(showTime.equals("Late-Night")){
            TimeBasedAdjustment = -20;
        }
        int CustomerDiscount = 0;
        if(customerType.equals("Adult")){
            CustomerDiscount = 0;
        }else if(customerType.equals("Senior")){
            CustomerDiscount = 25;
        }else if(customerType.equals("Student")){
            CustomerDiscount = 15;
        }else if(customerType.equals("Child")){
            CustomerDiscount = 30;
        }
        double baseWithSurcharges = BaseTicketPrice + FormatSurcharge + SeatUpgradeFee;
        double adjustedPrice = baseWithSurcharges * (1 + TimeBasedAdjustment/100.0);
        double finalPrice = adjustedPrice * (1 - CustomerDiscount/100.0);
        
        System.out.println("Movie Format: "+movieFormat);
        System.out.println("Show Time: "+showTime);
        System.out.println("Seat Category: "+seatCategory);
        System.out.println("Customer Type: "+customerType);
        System.out.println("Base Ticket Price: $"+BaseTicketPrice);
        System.err.println("Format Surcharge: $"+FormatSurcharge);
        System.out.println("Seat Upgrade Fee: $"+SeatUpgradeFee);
        System.out.println("Time-Based Adjustment: "+TimeBasedAdjustment+"%");
        System.out.println("Customer Discount: "+CustomerDiscount+"%");
        System.out.printf("Final Ticket Price: $%.1f\n",finalPrice);
        if(showTime.equals("Matinee")){
            System.out.println("Concession Voucher: Yes");
        }else if(customerType.equals("Student")){
            System.out.println("Concession Voucher: Yes");
        }else{
            System.out.println("Concession Voucher: No");

        }
        if(finalPrice<10){
            System.out.println("Pricing Category: Value");
        }else if(finalPrice>=20 && finalPrice<=30){
            System.out.println("Pricing Category: Premium");
        }else if(finalPrice>30){
            System.out.println("Pricing Category: Luxury");  
        }
        sc.close();
    }
}
