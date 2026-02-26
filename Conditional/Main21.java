import java.util.Scanner;
public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String locationZone = sc.next();
        Double parkingHours = sc.nextDouble();
        String vehicleType = sc.next();
        String membershipStatus = sc.next();
        double BaseHourlyRate =5.0;
        int ZonePremium = 0;
        if(locationZone.equals("Downtown")){
            ZonePremium = 50;
        }else if(locationZone.equals("Business-District")){
            ZonePremium = 30;
        }else if(locationZone.equals("Residential")){
            ZonePremium = 0;
        }else if(locationZone.equals("Airport")){
            ZonePremium = 100;
        }
        double VehicleSizeSurcharge = 0;
        if(vehicleType.equals("Motorcycle")){
            VehicleSizeSurcharge = -2;
        }else if(vehicleType.equals("Compact")){
            VehicleSizeSurcharge = 0;
        }else if(vehicleType.equals("Sedan")){
            VehicleSizeSurcharge = 0;
        }else if(vehicleType.equals("SUV")){
            VehicleSizeSurcharge = 3;
        }else if(vehicleType.equals("Oversized")){
            VehicleSizeSurcharge = 5;
        }
        int MembershipDiscount = 0;
        if(membershipStatus.equals("None")){
            MembershipDiscount = 0;
        }else if(membershipStatus.equals("Monthly")){
            MembershipDiscount = 20;
        }else if(membershipStatus.equals("Annual")){
            MembershipDiscount = 25;
        }else if(membershipStatus.equals("VIP")){
            MembershipDiscount = 30;
        }
        double  rawfee = (BaseHourlyRate * (1 + ZonePremium/100.0) + VehicleSizeSurcharge)* parkingHours;
        double Finalfee = (rawfee * (1 - MembershipDiscount/100.0));
        int DailyCapApplied = 0;
        if(parkingHours>=24){
            DailyCapApplied = 1;
        }else{
            DailyCapApplied = 0;
        }

        System.out.println("Location Zone: "+locationZone);
        System.out.println("Parking Duration: "+parkingHours);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Membership Status: "+membershipStatus);
        System.out.println("Base Hourly Rate: $"+BaseHourlyRate);
        System.out.println("Zone Premium: "+ZonePremium+"%");
        System.out.println("Vehicle Size Surcharge: $"+VehicleSizeSurcharge);
        System.out.println("Membership Discount: "+MembershipDiscount+"%");
        System.out.println("Total Parking Fee: $"+Finalfee);
        if(DailyCapApplied==1){
            System.out.println("Daily Cap Applied: Yes");
        }else if(DailyCapApplied==0){
            System.out.println("Daily Cap Applied: No");
        }
        if(locationZone.equals("Downtown")){
            System.out.println("Rate Category: Premium");
        }else if(locationZone.equals("Business-District")){
            System.out.println("Rate Category: Premium");
        }else if(locationZone.equals("Residential")){
            System.out.println("Rate Category: Standard");
        }else if(locationZone.equals("Airport")){
            System.out.println("Rate Category: Luxury");
        }
        sc.close();
    }
}
