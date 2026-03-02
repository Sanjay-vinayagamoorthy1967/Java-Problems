import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double TotalDistance = 0;
        double TotalRevenue = 0;
        for(int i=1;i<=n;i++){
            double distanceKM = sc.nextDouble();
            String timeOfDay = sc.next();
            double BaseFare = 3;
            double DistanceCharge = distanceKM*1.00;
            double surcharges = 0;
            if(timeOfDay.equals("Morning")){
                surcharges = 0;
            }else if(timeOfDay.equals("Afternoon")){
                surcharges = 0;
            }else if(timeOfDay.equals("Evening")){
                surcharges = 3;
            }else if(timeOfDay.equals("Night")){
                surcharges = 5;
            }
            double Totalfare = BaseFare + DistanceCharge + surcharges;
            TotalDistance += DistanceCharge;
            TotalRevenue += Totalfare;
            System.out.println();
            System.out.println("Ride "+i);
            System.out.println("Distance: "+distanceKM+" Km");
            System.out.println("Time: "+timeOfDay);
            System.out.println("Base Fare: $"+BaseFare);
            System.out.println("Distance Charge: $"+DistanceCharge);
            System.out.println("Time Surcharge: $"+surcharges);
            System.out.println("Total Fare: $"+Totalfare);
        }
            double AverageFare = TotalRevenue/n;
            System.out.println();
            System.out.println("Total Rides: "+n);
            System.out.println("Total Distance: "+TotalDistance+" Km");
            System.out.println("Total Revenue: $"+TotalRevenue);
            System.out.println("Average Fare: $"+AverageFare);
            sc.close();
    }
}
