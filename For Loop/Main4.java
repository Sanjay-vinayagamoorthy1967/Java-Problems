import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double Sales = 0;
        double Commissions = 0;
        double Highestsales = 0;
        String TopPerformer = "0";
        for(int i=0;i<n;i++){
            String repName = sc.next();
            double salesAmount = sc.nextDouble();
            int CommissionRate = 0;
            if(salesAmount>=0 && salesAmount<=40000){
                CommissionRate = 5;
            }else if(salesAmount>=40001 && salesAmount<=80000){
                CommissionRate = 8;
            }else if(salesAmount>=80001 && salesAmount<=100000){
                CommissionRate = 10;
            }else if(salesAmount>=100001 && salesAmount<150000){
                CommissionRate = 12;
            }else if(salesAmount>=150000){
                CommissionRate = 15;
            }
            double commission = (salesAmount*CommissionRate) / 100.0;
            double Bonus = 0;
            if(salesAmount>=150000){
                Bonus = 3000;
            }else if(salesAmount>=100000){
                Bonus = 2000;
            }
            
            double Totalpayout = commission + Bonus;
            Sales = Sales+salesAmount;
            Commissions = Commissions+commission+Bonus;
            if(salesAmount>Highestsales){
                Highestsales = salesAmount;
                TopPerformer = repName;
            }
            System.out.println();
            System.out.println("Sales Rep: "+repName);
            System.out.println("Sales Amount: $"+salesAmount);
            System.out.println("Commission Rate: "+CommissionRate+"%");
            System.out.println("Commission Earned: $"+commission);
            System.out.println("Bonus: $"+Bonus);
            System.out.println("Total Payout: $"+Totalpayout);
        }
            System.out.println();
            System.out.println("Total Sales Reps: "+n);
            System.out.println("Total Sales: $"+Sales);
            System.out.println("Total Commissions: $"+Commissions);
            System.out.println("Top Performer: "+TopPerformer);
            sc.close();
    }
}
