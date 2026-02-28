import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int TotalUnitsConsumed = 0;
        double TotalRevenue = 0;
        for(int i=0;i<n;i++){
            String consumerID = sc.next();
            int unitsConsumed = sc.nextInt();
            double BillAmount = 0;
            if(unitsConsumed>=0 && unitsConsumed<=100){
                BillAmount = unitsConsumed*0.10;
            }else if(unitsConsumed>=101 && unitsConsumed<=200){
                BillAmount = 100*0.10+(unitsConsumed-100)*0.15;
            }else if(unitsConsumed>=201 && unitsConsumed<=300){
                BillAmount = 100*0.10+100*0.15+(unitsConsumed-200)*0.22;
            }else if(unitsConsumed>=300){
                BillAmount = 100*0.10+100*0.15+100*0.22+(unitsConsumed-300)*0.22;
            }
            String Category="0";
            if(unitsConsumed<=200){
                Category = "Low Usage";
            }else if(unitsConsumed>=201 && unitsConsumed<=300){
                Category = " Medium Usage";
            }else if(unitsConsumed>300){
                Category = "High Usage";
            }
            TotalUnitsConsumed = TotalUnitsConsumed+unitsConsumed;
            TotalRevenue = TotalRevenue+BillAmount;
            System.out.println();
            System.out.println("Consumer ID: "+consumerID);
            System.out.println("Units Consumed: "+unitsConsumed);
            System.out.println("Bill Amount: $"+BillAmount);
            System.out.println("Category: "+Category);
        }
            double AverageBill = TotalRevenue/n;
            System.out.println();
            System.out.println("Total Consumers: "+n);
            System.out.println("Total Units Consumed: "+TotalUnitsConsumed);
            System.out.println("Total Revenue: $"+TotalRevenue);
            System.out.printf("Average Bill: $%.1f",AverageBill);
            sc.close();
    }
}
