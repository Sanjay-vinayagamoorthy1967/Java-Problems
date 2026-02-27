import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int count1=0;
        int TotalReorderQuantity = 0;
        for(int i=0;i<n;i++){
            String productName = sc.next();
            int currentStock = sc.nextInt();
            int minimumStock = sc.nextInt();
            String status="0";
            if( currentStock >= minimumStock){
                status = "Adequate";
            }else if(currentStock < minimumStock && currentStock >= minimumStock/2){
                status = "Low Stock";
            }else if(currentStock < minimumStock/2){
                status = "Critical";
            }
            int ReorderQuantity = 0;
            if(status.equals("Adequate")){
                ReorderQuantity = 0;
            }else if(status.equals("Low Stock")){
                count++;
                ReorderQuantity = (minimumStock - currentStock) + minimumStock/2;
            }else if(status.equals("Critical")){
                count1++;
                ReorderQuantity = (minimumStock - currentStock) + (int)(minimumStock*1.5);
            }
            TotalReorderQuantity +=ReorderQuantity;
            System.out.println();
            System.out.println("Product: "+productName);
            System.out.println("Current Stock: "+currentStock);
            System.out.println("Minimum Stock: "+minimumStock);
            System.out.println("Status: "+status);
            System.out.println("Reorder Quantity: "+(int)ReorderQuantity);
        }
        System.out.println();
        System.out.println("Total Products: "+n);
        System.out.println("Low Stock Items: "+count);
        System.out.println("Critical Items: "+count1);
        System.out.println("Total Reorder Quantity: "+TotalReorderQuantity);
    }
}
