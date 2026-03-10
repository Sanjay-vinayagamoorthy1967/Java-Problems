import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        double max = Integer.MIN_VALUE;
        int idx =0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
                idx = i+1;
            }
        }
        double avg = sum/n;
        double Threshold = (avg*80)/100.0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<Threshold){
                count++;
            }
        }
        System.out.println("Total Plots: "+n);
        System.out.printf("Total Harvest: %.2f tons\n",sum);
        System.out.printf("Average Yield: %.2f tons/acre\n",avg);
        System.out.printf("Highest Yield: %.2f tons/acre (Plot %d)\n",max,idx);
        System.out.println("Underperforming Plots: "+count);
        System.out.printf("Performance Threshold: %.2f tons/acre",Threshold);
        sc.close();
    }
}
