import java.util.Scanner;
public class Main10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeOfDay = sc.next();
        double powerConsumption = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        String rateTier = sc.next();
        double BaseRate = 0;
        if(rateTier.equals("Basic")){
            BaseRate = 0.18;
        }else if(rateTier.equals("Time-of-Use")){
            BaseRate = 0.15;
        }else if(rateTier.equals("Premium-Green")){
            BaseRate = 0.12;
        }
        double RateMultiplier=0;
        if(timeOfDay.equals("Peak")){
            if(rateTier.equals("Premium-Green")){
                RateMultiplier = 1.5;
            }else if(rateTier.equals("Time-of-Use")){
                RateMultiplier = 1.8;
            }
        }else if(timeOfDay.equals("Off-Peak")){
            if(rateTier.equals("Basic")){
                RateMultiplier = 1.5;
            }else if(rateTier.equals("Time-of-Use")){
                RateMultiplier = 0.8;
            }
        }else if(timeOfDay.equals("Super-Off-Peak")){
            if(rateTier.equals("Premium-Green")){
                RateMultiplier = 0.6;
            }else if(rateTier.equals("Time-of-Use")){
                RateMultiplier = 0.5;
            }
        }
        double renewablecredit = (powerConsumption*renewablePercentage /100)*BaseRate;
        double cost = (powerConsumption*BaseRate*RateMultiplier)-renewablecredit;
        int OptimizationRecommendation= 0;
        if(timeOfDay.equals("Peak") && renewablePercentage<=15.0){
            OptimizationRecommendation = 1;
        }else if(timeOfDay.equals("Super-Off-Peak") && renewablePercentage<=60.0){
            OptimizationRecommendation = 2;
        }else if(timeOfDay.equals("Off-Peak") && renewablePercentage>=35.0){
            OptimizationRecommendation = 3;
        }else if(timeOfDay.equals("Peak") && renewablePercentage>15.0){
            OptimizationRecommendation = 4;
        }else if(timeOfDay.equals("Off-Peak") && renewablePercentage<=20.0){
            OptimizationRecommendation = 5;
        }
        System.out.println("Time of Day: "+timeOfDay);
        System.out.println("Power Consumption: "+powerConsumption+"kWh");
        System.out.println("Renewable Energy: "+renewablePercentage+"%");
        System.out.println("Rate Tier: "+rateTier);
        System.out.println("Base Rate: $"+BaseRate+"/kWh");
        System.out.println("Rate Multiplier: "+RateMultiplier+"x");
        System.out.println("Renewable Credit: $"+renewablecredit);
        System.out.printf("Total Cost: $%.1f\n",cost);
        if(OptimizationRecommendation==1){
            System.out.println("Optimization Recommendation: Shift high-power appliances to Off-Peak hours");
        }else if(OptimizationRecommendation==2){
            System.out.println("Optimization Recommendation: Excellent! Maximize appliance use during this period");
        }else if(OptimizationRecommendation==3){
            System.out.println("Optimization Recommendation: Consider upgrading to Time-of-Use plan");
        }else if(OptimizationRecommendation==4){
            System.out.println("Optimization Recommendation: Great renewable usage! Minor peak reduction possible");
        }else if(OptimizationRecommendation==5){
            System.out.println("Optimization Recommendation: Good timing! Consider increasing renewable capacity");
        }
        sc.close();
    }
}
