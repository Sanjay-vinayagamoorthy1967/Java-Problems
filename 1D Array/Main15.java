import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr [i] = sc.nextInt();
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>300){
                count++;
            }
        }
        double avg = sum/n;
        double target = (double)(n-count)/n*100;
        System.out.println("Total Calls: "+n);
        System.out.println("Average Handling Time: "+avg+" Seconds");
        System.out.println("Shortest Call: "+min+" Seconds");
        System.out.println("Longest Call: "+max+" Seconds");
        System.out.println("Calls Exceeding Target (300s): "+ count);
        System.out.printf("Target Compliance: %.2f%%",target);
        sc.close();
    }
}
