import java.util.Scanner;
public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        int[] count = new int[n];
        int k = 0;
        double sum = 0;
        int index=0,idx = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
                idx = i+1;
            }
            if(arr[i]<min){
                min = arr[i];
                index = i+1;
            }
        }
        double avg = sum/n;
        double total = avg*2.0;
        int num = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>total){
                count[k++] = i+1;
                num++;
            }
        }

        System.out.println("Total Posts: "+n);
        System.out.printf("Average Engagement: %.2f%%\n",avg);
        System.out.printf("Peak Engagement: %.2f%% (Post %d)\n",max,idx);
        System.out.printf("Lowest Engagement: %.2f%% (Post %d)\n",min,index);
        System.out.println("Viral Posts (>200% avg): "+num);
        System.out.printf("Viral Threshold: %.2f%%\n",total);
        System.out.print("Top Performers: ");
        for(int i=0;i<k;i++){
            System.out.print(count[i]+" ");
        }
        sc.close();
    }
}
