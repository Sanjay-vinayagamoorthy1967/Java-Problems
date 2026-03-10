import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int count=0,count1=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<=15){
                count++;
            }
            if(arr[i]>180){
                count1++;
            }
            sum += arr[i];
        }
        double avg = (double)sum/n;
        double performance = (count/n)*100;
        System.out.println("Total Flights: "+n);
        System.out.printf("Average Delay: %.2f minutes\n",avg);
        System.out.println("Maximum Delay: "+max+" minutes");
        System.out.println("On-Time Flights: "+count);
        System.out.println("Compensation Required: "+count1);
        System.out.printf("On-Time Performance: %.2f%%",performance);
        sc.close();
    }
}
