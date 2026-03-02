import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double TotalFines = 0;
        int count=0;
        for(int i=1;i<=n;i++){
            String bookType = sc.next();
            int daysLate = sc.nextInt();
            double  DailyFine = 0;
            if(bookType.equals("Regular")){
                 DailyFine = 0.50;
            }else if(bookType.equals("Reference")){
                 DailyFine = 1.00;
            }else if(bookType.equals("Magazine")){
                 DailyFine = 0.25;
            }
            double CalculatedFine = daysLate * DailyFine;
            double ActualFine = CalculatedFine;
            String CapApplied = "No";
            if(bookType.equals("Regular")){
                if(CalculatedFine>10){
                 ActualFine = 10;
                 CapApplied = "Yes";
                }
            }else if(bookType.equals("Reference")){
                 if(CalculatedFine>20){
                 ActualFine = 20;
                 CapApplied = "Yes";
                }
            }else if(bookType.equals("Magazine")){
                 if(CalculatedFine>5){
                 ActualFine = 5;
                 CapApplied = "Yes";
                }
            }
               TotalFines += ActualFine;
               if(daysLate>0){
                count++;
               }
               System.out.println();
               System.out.println("Book "+i+":"+bookType);
               System.out.println("Days Late: "+daysLate);
               System.out.println("Daily Fine: $"+DailyFine);
               System.out.println("Calculated Fine: $"+CalculatedFine);
               System.out.println("Actual Fine: $"+ActualFine);
               System.out.println("Cap Applied: "+CapApplied);
        }
            double averagefine = TotalFines / n;
            System.out.println();
            System.out.println("Total Books: "+n);
            System.out.println("Total Fines Collected: $"+TotalFines);
            System.out.println("Books Overdue: "+count);
            System.out.printf("Average Fine: $%.2f",averagefine);
            sc.close();
    }
}
