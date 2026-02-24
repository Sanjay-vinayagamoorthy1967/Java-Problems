import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomCategory = sc.next();
        String season = sc.next();
        int nightsBooked = sc.nextInt();
        String loyaltyTier = sc.next();
        double BaseRatePerNight = 0;
        if(roomCategory.equals("Standard")){
            BaseRatePerNight = 150;
        }else if(roomCategory.equals("Deluxe")){
            BaseRatePerNight = 300;
        }else if(roomCategory.equals("Suite")){
            BaseRatePerNight = 500;
        }else if(roomCategory.equals("Presidential")){
            BaseRatePerNight = 1000;
        }
        double SeasonalMultiplier = 0;
        if(season.equals("Off-Peak")){
            SeasonalMultiplier  = 0.7;
        }else if(season.equals("Regular")){
            SeasonalMultiplier  = 1.0;
        }else if(season.equals("Peak")){
            SeasonalMultiplier  = 1.5;
        }else if(season.equals("Holiday")){
            SeasonalMultiplier  = 2.0;
        }
        int ExtendedStayDiscount = 0;
        if(nightsBooked>=1 && nightsBooked<=4){
            ExtendedStayDiscount = 0;
        }else if(nightsBooked>=5 && nightsBooked<=7){
            ExtendedStayDiscount = 5;
        }else if(nightsBooked>=8 && nightsBooked<=14){
            ExtendedStayDiscount = 10;
        }else if(nightsBooked>=15){
            ExtendedStayDiscount = 20;
        }  
        int LoyaltyDiscount = 0;
        if(loyaltyTier.equals("None")){
            LoyaltyDiscount = 0;
        }else if(loyaltyTier.equals("Member")){
            LoyaltyDiscount = 10;
        }else if(loyaltyTier.equals("Gold")){
            LoyaltyDiscount = 15;
        }else if(loyaltyTier.equals("Platinum")){
            LoyaltyDiscount = 20;
        }  
        double seasonalRate = BaseRatePerNight * SeasonalMultiplier;
        double discountedRate = seasonalRate * (1 - ExtendedStayDiscount/100.0) * (1 - LoyaltyDiscount/100.0);
        double totalCost = discountedRate * nightsBooked;
        System.out.println("Room Category: "+roomCategory);
        System.out.println("Season: "+season);
        System.out.println("Nights Booked: "+nightsBooked);
        System.out.println("Loyalty Tier: "+loyaltyTier);
        System.out.println("Base Rate Per Night: $"+BaseRatePerNight);
        System.out.println("Seasonal Multiplier: "+SeasonalMultiplier+"x");
        System.out.println("Extended Stay Discount: "+ExtendedStayDiscount+"%");
        System.out.println("Extended Stay Discount: "+LoyaltyDiscount+"%");
        System.out.println("Nightly Rate: $"+discountedRate);
        System.out.println("Total Booking Cost: $"+totalCost);
        if(loyaltyTier.equals("None")){
            System.out.println("Complimentary Upgrades: None");
        }else if(loyaltyTier.equals("Member")){
            System.out.println("Complimentary Upgrades: Free breakfast");
        }else if(loyaltyTier.equals("Gold")){
            System.out.println("Complimentary Upgrades: Free breakfast and spa access");
        }else if(loyaltyTier.equals("Platinum")){
            System.out.println("Complimentary Upgrades: Concierge service, airport transfer, and fine dining");
        }
        sc.close();
    }
}
