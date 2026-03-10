import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        double max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i=0;i<n;i++){
            arr [i] = sc.nextDouble();
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
                idx = i+1;
            }
        }
        double avg = sum/n;
        double limit = sc.nextDouble();
        double status = sum - limit;
        System.out.println("Hours Monitored: "+n);
        System.out.printf("Total Daily Consumption: %.2f kWh\n",sum);
        System.out.printf("Peak Hour: Hour %d (%.2f kWh)\n)",idx,max);
        System.out.printf("Average Hourly: %.2f kWh\n",avg);
        System.out.printf("Daily Limit: %.2f kWh\n",limit);
        if(limit>sum){
            System.out.println("Status: Within Limit");
        }else{
            System.out.printf("Status: Exceeded by %.2f kWh",status);
        }
        sc.close();
    }
}
