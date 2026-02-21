import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tier = sc.next();
        double value = sc.nextDouble();
        String product = sc.next();
        String status = sc.next();
        int discount=0;
        if(tier.equals("Bronze")){
            discount=5;
        }else if(tier.equals("Silver")){
            discount=8;
        }else if(tier.equals("Gold")){
            discount=12;
        }else if(tier.equals("Platinum")){
            discount=15;
        }
        int dis=0;
        if(value>=500 && value<=999){
            dis = 3;
        }else if(value>=1000 && value<=1999){
            dis = 5;
        }else if(value>=2000){
            dis = 7;
        }
        int disc = 0;
        if(product.equals("Electronics"))
        {
            if(status.equals("Prime")){
                disc = 5;
            }
        }else if(product.equals("Fashion")){
            disc = 3;
        }else if(product.equals("Books"))
            {
            if(status.equals("Prime")){
                disc = 5;
            }
        }else if(product.equals("Groceries") && value>300){
            disc = 2;
        }
        int tot = dis+disc;
        int total = tot+discount;
        double finals = (value*total)/100;
        double fin = value-finals;
        double savings = value-fin;
        System.out.println("Loyalty Tier: "+tier);
        System.out.println("Cart Value: "+value);
        System.out.println("Product Category: "+product);
        System.out.println("Membership: "+status);
        System.out.println("Base Discount: "+discount+"%");
        System.out.println("Additional Discount: "+tot+"%");
        System.out.println("Total Discount: "+total+"%");
        System.out.println("Final Price: $"+fin);
        System.out.println("Savings: $"+savings); 
        sc.close();
    }
}
