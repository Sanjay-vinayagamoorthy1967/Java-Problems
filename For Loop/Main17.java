import java.util.Scanner;
public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        double TotalRenewal = 0;
        double AverageRenewal = 0;
        for(int i=0;i<n;i++){
            String memberName = sc.next();
            String membershipType = sc.next();
            int daysUntilExpiry = sc.nextInt();
            double RenewalFee = 0;
            if(membershipType.equals("Basic")){
                RenewalFee = 50;
            }else if(membershipType.equals("Premium")){
                RenewalFee = 100;
            }else if(membershipType.equals("VIP")){
                RenewalFee = 200;
            }
            int Discount = 0;
            if(daysUntilExpiry>45){
                Discount = 20;
            }else if(daysUntilExpiry>=30 && daysUntilExpiry<=44){
                Discount = 15;
            }else if(daysUntilExpiry>=15 && daysUntilExpiry<=29){
                Discount = 10;
            }else if(daysUntilExpiry<15){
                Discount = 0;
            }
            double finalfee = (double)RenewalFee*(1-Discount/100.0);
            String Priority = "0";
            if(daysUntilExpiry<10){
                Priority ="Urgent";
                count++;
            }else if(daysUntilExpiry>=10 && daysUntilExpiry<=30){
                Priority ="High";
            }else if(daysUntilExpiry>30){
                Priority ="Normal";
            }
            TotalRenewal += finalfee;
            System.out.println();
            System.out.println("Member: "+memberName);
            System.out.println("Membership: "+membershipType);
            System.out.println("Days Until Expiry: "+daysUntilExpiry);
            System.out.println("Renewal Fee: $"+RenewalFee);
            System.out.println("Discount: "+Discount+"%");
            System.out.println("Final Fee: $"+finalfee);
            System.out.println("Priority: "+Priority);
        }
            AverageRenewal = TotalRenewal/n;
            System.out.println();
            System.out.println("Total Members: "+n);
            System.out.println("Urgent Renewals: "+count);
            System.out.println("Total Renewal Revenue: "+TotalRenewal);
            System.out.println("Average Renewal Fee: $"+AverageRenewal);
            sc.close();
    }
}



