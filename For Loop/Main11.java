import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double originaltotal = 0;
        double finaltotal = 0;
        double ticketprice = 0;
        for(int i=1;i<=n;i++){
            String seatType = sc.next();
            String customerType = sc.next();
            double BasePrice = 0;
            if(seatType.equals("Regular")){
                BasePrice = 12;
            }else if(seatType.equals("Premium")){
                BasePrice = 18;
            }else if(seatType.equals("Recliner")){
                BasePrice = 25;
            }
            int Discount = 0;
            if(customerType.equals("Adult")){
                Discount=0;
            }else if(customerType.equals("Child")){
                Discount=30;
            }else if(customerType.equals("Senior")){
                Discount=25;
            }
            ticketprice = BasePrice * (1 - Discount/100.0);
            originaltotal  += BasePrice;
            finaltotal += ticketprice;
            System.out.println();
            System.out.println("Total Tickets: "+i);
            System.out.println("Base Price: $"+BasePrice);
            System.out.println("Discount: "+Discount+"%");
            System.out.printf("Final Price: $%.1f\n",ticketprice);
        }
            double tot = 0;
            if(n>=5){
                tot = (finaltotal*10)/100.0;
                finaltotal = finaltotal-tot;
            }

            double discount = originaltotal-finaltotal;
            System.out.println();
            System.out.println("Total Tickets: "+n);
            System.out.println("Original Total: $"+originaltotal);
            System.out.printf("Total Discount: $%.1f\n",discount);
            System.out.printf("Final Total: $%.1f\n",finaltotal);
            if(n>=5){
                System.out.println("Group Discount Applied: Yes");
            }else{
                System.out.println("Group Discount Applied: No");
            }
            sc.close();
        }
        
}
