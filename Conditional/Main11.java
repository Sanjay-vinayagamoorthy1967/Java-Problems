import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orderType = sc.next();
        String loyaltyStatus = sc.next();
        double orderValue = sc.nextDouble();
        String timeSlot = sc.next();
        int BaseDiscount = 0;
        if(loyaltyStatus.equals("Gold")){
            BaseDiscount = 15;
        }else if(loyaltyStatus.equals("Silver")){
            BaseDiscount = 10;
        }else if(loyaltyStatus.equals("Bronze")){
            BaseDiscount = 5;
        }else if(loyaltyStatus.equals("None")){
            BaseDiscount = 0;
        }
        int TimeBasedAdjustment = 0;
        if(timeSlot.equals("Peak")){
            TimeBasedAdjustment = 0;
        }else if(timeSlot.equals("Regular")){
            TimeBasedAdjustment = 0;
        }else if(timeSlot.equals("Late-Night")){
            TimeBasedAdjustment = -5;
        }
        double ServiceFee = 0;
        if(orderType.equals("Delivery")){
            ServiceFee = (orderValue*10)/100;
        }else if(orderType.equals("Takeout")){
            ServiceFee = (orderValue*3)/100;
        }else if(orderType.equals("Dine-In")){
            ServiceFee = (orderValue*0)/100;
        }
        int tot = BaseDiscount+TimeBasedAdjustment;
        double discountedValue = orderValue *(1 -tot)/100;
        double finalAmount = discountedValue + ServiceFee;
        int KitchenPriority = 0;
        if(timeSlot.equals("Peak") && orderType.equals("Delivery")){
            KitchenPriority =1;
        }else if(timeSlot.equals("Regular")){
            KitchenPriority =2;
        }else if(timeSlot.equals("Late-Night")){
            KitchenPriority =3;
        }
        int EstimatedPrepTime = 0;
        if(orderType.equals("Delivery") && loyaltyStatus.equals("Gold") && (KitchenPriority==1)){
            EstimatedPrepTime = 25;
        }else if(orderType.equals("Dine-In") && loyaltyStatus.equals("None") && (KitchenPriority==2)){
            EstimatedPrepTime = 20;
        }else if(orderType.equals("Takeout") && loyaltyStatus.equals("Silver") && (KitchenPriority==3)){
            EstimatedPrepTime = 15;
        }else if(orderType.equals("Delivery") && loyaltyStatus.equals("Bronze") && (KitchenPriority==1)){
            EstimatedPrepTime = 30;
        }else if(orderType.equals("Dine-In") && loyaltyStatus.equals("Gold") && (KitchenPriority==2)){
            EstimatedPrepTime = 25;
        }
        System.out.println("Order Type: "+orderType);
        System.out.println("Loyalty Status: "+loyaltyStatus);
        System.out.println("Order Value: $"+orderValue);
        System.out.println("Time Slot: "+timeSlot);
        System.out.println("Base Discount: "+BaseDiscount+"%");
        System.out.println("Time-Based Adjustment: "+TimeBasedAdjustment+"%");
        System.out.println("Service Fee: $"+ServiceFee);
        System.out.println("Final Amount: $"+finalAmount);
        if(KitchenPriority==1){
            System.out.println("Kitchen Priority: High");
        }else if(KitchenPriority==2){
            System.out.println("Kitchen Priority: Medium");
        }else if(KitchenPriority==3){
            System.out.println("Kitchen Priority: Low");
        }
        System.out.println("Estimated Prep Time: "+EstimatedPrepTime+" minutes");
        sc.close();
    }
}
