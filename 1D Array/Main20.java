import java.util.Scanner;
public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;
        int index=0,idx = 0;
        for(int i=0;i<n;i++){
            arr [i] = sc.nextInt();
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
                idx = i+1;
            }
            if(arr[i]<min){
                min = arr[i];
                index = i+1;
            }
            if(arr[i]<60){
                count++;
            }
        }
        double avg = (double)sum/n;
        int total = n-count;
        double success = (double)total/n*100;

        System.out.println("Total Students: "+n);
        System.out.printf("Average Completion: %.2f%%\n",avg);
        System.out.printf("Highest Completion: %d%% (Student %d)\n",max,idx);
        System.out.printf("Lowest Completion: %d%% (Student %d)\n",min,index);
        System.out.println("At-Risk Students (<60%): "+count);
        System.out.printf("Success Rate: %.2f%%",success);
        sc.close();
    }
}
