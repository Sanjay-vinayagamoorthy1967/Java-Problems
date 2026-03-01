import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double  subtotal=0;
        double totalprice=0;
        int totalquantity=0;
        double totaldiscount = 0;
        double totalsubtotal = 0;
        for(int i=0;i<n;i++){
            String productName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            int discount = 0;
            if(quantity==1){
                discount = 0;
            }else if(quantity>=2 && quantity<=4){
                discount = 10;
            }else if(quantity>=5 && quantity<=9){
                discount = 15;
            }else if(quantity>=10){
                discount = 20;
            }
            double originalprice = price*quantity;
            subtotal = price * quantity * (1 - discount/100.0); 
            totalprice = totalprice+originalprice;
            totalquantity = totalquantity+quantity;
            totalsubtotal = totalsubtotal+subtotal;
            System.out.println();
            System.out.println("Product: "+productName);
            System.out.println("Unit Price: $"+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Subtotal: $"+subtotal);
        }
            double originaltotal = totalprice;
            double FinalTotal = totalsubtotal;
            totaldiscount = originaltotal-FinalTotal;
            double savings = (totaldiscount / originaltotal) * 100;
            System.out.println();
            System.out.println("Total Items: "+totalquantity);
            System.out.println("Original Total: $"+originaltotal);
            System.out.println("Total Discount: $"+totaldiscount);
            System.out.println("Final Total: $"+FinalTotal);
            System.out.printf("Savings: %.2f%%",savings);
            sc.close();
    }
}
