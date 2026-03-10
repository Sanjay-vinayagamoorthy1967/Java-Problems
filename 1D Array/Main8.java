import java.util.*;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int large = Integer.MIN_VALUE;
        int[] arr = new int[n];
        int count = 0;
        int sum =0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>large){
                large = arr[i];
            }
            if(arr[i]>60){
                count++;
            }
            sum += arr[i];
        }
        double avg = ((double)sum)/n;
        double service = ((double)n-count)/n*100;
        System.out.println("Total Patients: "+n);
        System.out.println("Longest Wait Time: "+large+" minutes");
        System.out.printf("Average Wait Time: %.2f minutes\n",avg);
        System.out.println("Patients Waiting >60 min: "+count);
        System.out.printf("Service Level: %.2f%%",service);
        sc.close();
    }
}
