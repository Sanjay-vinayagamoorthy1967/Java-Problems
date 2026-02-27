import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double TotalPayroll=0;
        for(int i=0;i<n;i++){
             int incrementpercentage = 0;
                String employeename = sc.next();
                int basesalary = sc.nextInt();
                int performancerating = sc.nextInt();
            if(performancerating == 5){
                 incrementpercentage =15;
            }else if(performancerating == 4){
                 incrementpercentage =10;
            }else if(performancerating == 3){
                 incrementpercentage =5;
            }else if(performancerating == 2){
                 incrementpercentage =2;
            }else if(performancerating == 1){
                 incrementpercentage = 0;
            }
            double finalsalary = basesalary * (1 + incrementpercentage/100.0);
            System.out.println("Employee: "+employeename);
            System.out.println("Base Salary: $"+(float)basesalary);
            System.out.println("Performance Rating: "+performancerating);
            System.out.println("perform : "+incrementpercentage+"%");
            System.out.printf("Final Salary: $%.1f",finalsalary);
            TotalPayroll = TotalPayroll +finalsalary;
            System.out.println(" ");
        }
            
            System.out.println("Total Employees Processed: "+n);
            System.out.println("Total Payroll: $"+TotalPayroll);
            double AverageSalary = TotalPayroll/n;
            System.err.printf("Average Salary: $%.1f",AverageSalary);
            sc.close();
    }
}
