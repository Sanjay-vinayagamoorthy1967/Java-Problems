import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double TotalRevenue = 0;
        int count = 0;
        for(int i=1;i<=n;i++){
            String vehicleType = sc.next();
            double hoursParked = sc.nextDouble();
            double HourlyRate = 0;
            if(vehicleType.equals("Car")){
                HourlyRate = 3;
            }else if(vehicleType.equals("Motorcycle")){
                HourlyRate = 2;
            }else if(vehicleType.equals("Truck")){
                HourlyRate = 5;
            }else if(vehicleType.equals("Bus")){
                HourlyRate = 7;
            }
            String CapApplied = "No";
            double ParkingFee = hoursParked*HourlyRate;
          
            if(vehicleType.equals("Car")){
                if(ParkingFee>=30){
                    CapApplied = "Yes";
                    ParkingFee =30;
                }
            }else if(vehicleType.equals("Motorcycle")){
                if(ParkingFee>=20){
                    CapApplied = "Yes";
                    ParkingFee = 20;
                }
            }else if(vehicleType.equals("Truck")){
                if(ParkingFee>=60){
                    CapApplied = "Yes";
                    ParkingFee = 60;
                }
            }else if(vehicleType.equals("Bus")){
                if(ParkingFee>=100){
                    CapApplied = "Yes";
                    ParkingFee = 100;
                }
            }
            TotalRevenue +=ParkingFee;
            if(hoursParked>8){
                count++;
            }
            System.out.println();
            System.out.println("Vehicle "+i+": "+vehicleType);
            System.out.println("Hours Parked: "+hoursParked);
            System.out.println("Hourly Rate: $"+HourlyRate);
            System.out.println("Parking Fee: $"+ParkingFee);
            System.out.println("Cap Applied: "+CapApplied);
        }
            double AverageFee = TotalRevenue/n;
            System.out.println();
            System.out.println("Total Vehicles: "+n);
            System.out.println("Total Revenue: $"+TotalRevenue);
            System.out.println("Average Fee: $"+AverageFee);
            System.out.println("Peak Hour Vehicles (>8 hours): "+count);
            sc.close();
    }
}
