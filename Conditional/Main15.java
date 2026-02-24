import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userCount = sc.nextInt();
        String licenseType = sc.next();
        String supportLevel = sc.next();
        int contractYears = sc.nextInt();
        double BasePricePerUser =0;
        if(licenseType.equals("Standard")){
            BasePricePerUser = 60;
        }else if(licenseType.equals("Professional")){
            BasePricePerUser = 120;
        }else if(licenseType.equals("Enterprise")){
            BasePricePerUser = 200;
        }
        int VolumeDiscount=0;
        if(userCount>=1 && userCount<=50){
            VolumeDiscount = 0;
        }else if(userCount>=51 && userCount<=200){
            VolumeDiscount = 15;
        }else if(userCount>=201 && userCount<=500){
            VolumeDiscount = 20;
        }else if(userCount>=501 && userCount<=1000){
            VolumeDiscount = 25;
        }else if(userCount>=1001){
            VolumeDiscount = 35;
        }
        double SupportFeePerUser = 0;
        if(supportLevel.equals("Basic")){
            SupportFeePerUser = 10;
        }else if(supportLevel.equals("Priority")){
            SupportFeePerUser = 30;
        }else if(supportLevel.equals("Premium")){
            SupportFeePerUser = 80;
        }
        int MultiYearDiscount =0;
        if(contractYears==1){
            MultiYearDiscount = 0;
        }else if(contractYears==2){
            MultiYearDiscount = 5;
        }else if(contractYears==3){
            MultiYearDiscount = 10;
        }else if(contractYears==5){
            MultiYearDiscount = 20;
        }
        double discountedBase = BasePricePerUser * (1 - VolumeDiscount/100.0);
        double AnnualCostPerUser =(discountedBase + SupportFeePerUser) * (1 - MultiYearDiscount/100.0);
        double totalAnnual = AnnualCostPerUser * userCount;
        double contractValue = totalAnnual * contractYears;
        System.out.println("User Count: "+userCount);
        System.out.println("License Type: "+licenseType);
        System.out.println("Support Level: "+supportLevel);
        System.out.println("Contract Duration: "+contractYears+" years");
        System.out.println("Base Price Per User: $"+BasePricePerUser);
        System.out.println("Volume Discount: "+VolumeDiscount+"%");
        System.out.println("Support Fee Per User: $"+SupportFeePerUser);
        System.out.println("Multi-Year Discount: "+MultiYearDiscount+"%");
        System.out.printf("Annual Cost Per User: $%.1f\n",AnnualCostPerUser);
        System.out.printf("Total Annual Cost: $%.1f\n",totalAnnual);
        System.out.printf("Total Contract Value: $%.1f\n",contractValue);
        if(userCount<200){
            System.out.println("Pricing Tier: Small Business");
        }else if(userCount>=200 && userCount<=1000){
            System.out.println("Pricing Tier: Mid-Market");
        }else if(userCount>1000){
            System.out.println("Pricing Tier: Enterprise");
        }

      sc.close();
        
    }
}
