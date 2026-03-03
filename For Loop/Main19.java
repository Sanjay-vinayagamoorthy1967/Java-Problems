import java.util.Scanner;
public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            String productID = sc.next();
            String productType = sc.next();
            int monthsSincePurchase = sc.nextInt();
            int WarrantyPeriod = 0;
            if(productType.equals("Electronics")){
                WarrantyPeriod = 12;
            }else if(productType.equals("Appliance")){
                WarrantyPeriod = 24;
            }else if(productType.equals("Computer")){
                WarrantyPeriod = 36;
            }
            int Remaining =  WarrantyPeriod - monthsSincePurchase;
            String Status = "0";
            if(Remaining==0 || Remaining<0){
                Status = "Expired";
                count++;
            }else if(Remaining>=1 && Remaining<=3){
                Status = "Expiring Soon";
                count1++;
            }else if(Remaining>3){
                Status = "Active";
                count2++;
            }
                System.out.println();
                System.out.println("Product ID: "+productID);
                System.out.println("Type: "+productType);
                System.out.println("Warranty Period: "+WarrantyPeriod+" months");
                System.out.println("Months Used: "+monthsSincePurchase);
                if(Remaining>0){
                    System.out.println("Remaining: "+Remaining+" months");
                }else{
                    System.out.println("Remaining: 0 months");
                }
                System.out.println("Status: "+Status);
        }
                System.out.println();
                System.out.println("Total Products: "+n);
                System.out.println("Active Warranties: "+count2);
                System.out.println("Expiring Soon: "+count1);
                System.out.println("Expired Warranties: "+count);
                sc.close();
    }
}
