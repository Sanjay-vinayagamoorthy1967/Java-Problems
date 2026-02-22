import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String booking = sc.next();
        int days = sc.nextInt();
        double available = sc.nextDouble();
        String type = sc.next();
        double price = 0;
        if(booking.equals("Economy")){
            if(type.equals("Domestic")){
                price = 200;
            }else if(type.equals("International-Short")){
                price = 500;
            }else if(type.equals("International-Long")){
                price = 800;
            }
        }
        if(booking.equals("Business")){
            if(type.equals("Domestic")){
                price = 600;
            }else if(type.equals("International-Short")){
                price = 1500;
            }else if(type.equals("International-Long")){
                price = 2500;
            }
        }
         if(booking.equals("First")){
            if(type.equals("Domestic")){
                price = 100;
            }else if(type.equals("International-Short")){
                price = 3000;
            }else if(type.equals("International-Long")){
                price = 5000;
            }
        }
        double num = 0;
        int count=0;
        if(available<30 && days<14){
            num=1.8;
            count = 1;
        }else if(available<50 && days<30){
            num = 1.5;
            count = 1;
        }else if(available<60 || (days>=30 && days<=60)){
            num = 1.0;
            count = 2;
        }else if(available>=60 && days>60){
            num = 0.8;
            count = 3;
        }
        double fin = price*num;
        System.out.println("Booking Class: "+booking);
        System.out.println("Days Until Departure: "+days);
        System.out.println("Seat Availability: "+available+"%");
        System.out.println("Route Type: "+type);
        System.out.println("Base Price: $"+price);
        System.out.println("Demand Multiplier: "+num+"x");
        System.out.println("Final Ticket Price: $"+fin);
        if(count ==1){
            System.out.println("Pricing Category: High Demand");
        }else if(count==2){
            System.out.println("Pricing Category: Moderate");
        }else if(count==3){
            System.out.println("Pricing Category: Low Demand");
        }
        sc.close();
    }
}
