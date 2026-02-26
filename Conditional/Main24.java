import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceMiles = sc.nextDouble();
        double orderValue = sc.nextDouble();
        String timeSlot = sc.next();
        String weatherCondition = sc.next();
        double BaseDeliveryFee = 3.0;
        double DistanceSurcharge = distanceMiles*1;
        double PeakTimeSurcharge = 0.0;
        if(timeSlot.equals("Breakfast")){
            PeakTimeSurcharge = 0.0;
        }else if(timeSlot.equals("Lunch")){
            PeakTimeSurcharge = 2.50;
        }else if(timeSlot.equals("Dinner")){
            PeakTimeSurcharge = 2.00;
        }else if(timeSlot.equals("Late-Night")){
            PeakTimeSurcharge = 1.50;
        }
        double WeatherSurcharge = 0.0;
        if(weatherCondition.equals("Clear")){
            WeatherSurcharge = 0.0;
        }else if(weatherCondition.equals("Rain")){
            WeatherSurcharge = 2.0;
        }else if(weatherCondition.equals("Snow")){
            WeatherSurcharge = 3.0;
        }else if(weatherCondition.equals("Storm")){
            WeatherSurcharge = 5.0;
        }
        double OrderValueDiscount =0.0;
        if(orderValue>=30 && orderValue<=49.99){
            OrderValueDiscount  = 2.0;
        }else if(orderValue>=50 && orderValue<=74.99){
            OrderValueDiscount  = 3.0;
        }else if(orderValue>=75){
            OrderValueDiscount  = 5.0;
        }
       
        double Finalfee = BaseDeliveryFee + DistanceSurcharge + PeakTimeSurcharge + WeatherSurcharge - OrderValueDiscount;
        double Basetime = distanceMiles * 8;
        if(Finalfee<2.99){
            Finalfee = 2.99;
        }
        if(timeSlot.equals("Lunch") ||timeSlot.equals("Dinner")){
            Basetime +=10;
        }
        if(weatherCondition.equals("Rain")){
            Basetime+=5;
        }else if(weatherCondition.equals("Snow")){
            Basetime+=10;
        }else if(weatherCondition.equals("Storm")){
            Basetime+=15;
        }
        String ServicePriority;
        if(orderValue>60){
            ServicePriority = "Express";
        }else if(timeSlot.equals("Dinner") || timeSlot.equals("Lunch")){
            ServicePriority = "High";
        }else{
            ServicePriority = "Standard";
        }
        System.out.println("Delivery Distance: "+distanceMiles+"miles");
        System.out.println("Order Value: $"+orderValue);
        System.out.println("Time Slot: "+timeSlot);
        System.out.println("Weather Condition: "+weatherCondition);
        System.out.println("Base Delivery Fee: $"+BaseDeliveryFee);
        System.out.println("Distance Surcharge: $"+DistanceSurcharge);
        System.out.println("Peak Time Surcharge: $"+PeakTimeSurcharge);
        System.out.println("Weather Surcharge: $"+WeatherSurcharge);
        System.out.println("Order Value Discount: $"+OrderValueDiscount);
        System.out.println("Final Delivery Fee: $"+Finalfee);
        System.out.println("Estimated Delivery Time: "+(int)Basetime+" minutes");
        System.out.println("Service Priority: "+ServicePriority);    
        sc.close();
        
    }
}
