import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int driverAge = sc.nextInt();
        String vehicleType = sc.next();
        String drivingRecord = sc.next();
        String coverageLevel = sc.next();
        int BasePremium = 0;
        if(coverageLevel.equals("Basic")){
            BasePremium = 500;
        }else if(coverageLevel.equals("Standard")){
            BasePremium = 800;
        }else if(coverageLevel.equals("Comprehensive")){
            BasePremium = 1500;
        }
        double AgeFactor = 0;
        if(driverAge>=16 && driverAge<=21){
            AgeFactor = 1.8;
        }else if(driverAge>=22 && driverAge<=25){
            AgeFactor = 1.5;
        }else if(driverAge>=26 && driverAge<=40){
            AgeFactor = 1.0;
        }else if(driverAge>=41 && driverAge<=60){
            AgeFactor = 0.9;
        }else if(driverAge>=61){
            AgeFactor = 1.1;
        }
        double VehicleRiskFactor =0;
        if(vehicleType.equals("Sedan")){
            VehicleRiskFactor=1.0;
        }else if(vehicleType.equals("SUV")){
            VehicleRiskFactor=1.2;
        }else if(vehicleType.equals("Sports")){
            VehicleRiskFactor=1.5;
        }else if(vehicleType.equals("Truck")){
            VehicleRiskFactor=1.1;
        }
        int RecordAdjustment = 0;
        if(drivingRecord.equals("Clean")){
            RecordAdjustment = -10;
        }else if(drivingRecord.equals("Minor-Violations")){
            RecordAdjustment = 25;
        }else if(drivingRecord.equals("Major-Violations")){
            RecordAdjustment = 50;
        }
        double adjustedPremium = BasePremium*AgeFactor*VehicleRiskFactor;
        double finalPremium = adjustedPremium*(1 + RecordAdjustment/100.0);
        double monthlyPremium = finalPremium/12;
        double RiskCategory = AgeFactor+VehicleRiskFactor;
        int sum=0;
        if(RiskCategory>3.0){
            sum=1;
        }else if(RiskCategory>2.5){
            sum=2;
        }else if(RiskCategory>2.0 && AgeFactor>VehicleRiskFactor){
            sum=3;
        }else if(RiskCategory<=2.1){
            sum=4;
        }

        System.out.println("Driver Age: "+driverAge);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Driving Record: "+drivingRecord);
        System.out.println("Coverage Level: "+coverageLevel);
        System.out.println("Base Premium: $"+BasePremium);
        System.out.println("Age Factor: "+AgeFactor+"x");
        System.out.println("Vehicle Risk Factor: "+VehicleRiskFactor+"x");
        System.out.println("Record Adjustment: "+RecordAdjustment+"%");
        System.out.printf("Monthly Premium: $%.2f\n",monthlyPremium);
        System.out.printf("Annual Premium: $%.1f\n",finalPremium);
        if(sum==1){
            System.out.println("Risk Category: Very High");
        }else if(sum==2){
            System.out.println("Risk Category: High");
        }else if(sum==3){
            System.out.println("Risk Category: Medium");
        }else if(sum==4){
            System.out.println("Risk Category: Low");
        }
        sc.close();
    }
}
