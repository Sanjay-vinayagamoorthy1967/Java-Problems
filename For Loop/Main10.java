import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalSubtotal = 0;
        double Subtotal = 0;
        int totalquantity=0;
        for(int i=0;i<n;i++){
            String itemName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            Subtotal = price*quantity;
            totalquantity = totalquantity+quantity;
            System.out.println();
            System.out.println("Item: "+itemName);
            System.out.println("Price: $"+price+" x "+quantity);
            System.out.println("Subtotal: $"+Subtotal);
            totalSubtotal = totalSubtotal+Subtotal;
        }
            double Tax = totalSubtotal*0.08;
            double Servicecharge = totalSubtotal*0.10;
            double GrandTotal = totalSubtotal+Tax+Servicecharge;
            System.out.println();
            System.out.println("Total Items: "+totalquantity);
            System.out.println("Subtotal: $"+totalSubtotal);
            System.out.println("Tax (8%): $"+Tax);
            System.out.printf("Service Charge (10%%): $%.1f\n",Servicecharge);
            System.out.println("Grand Total: $"+GrandTotal);
            sc.close();
    }
}
