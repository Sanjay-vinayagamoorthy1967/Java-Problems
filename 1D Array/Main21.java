import java.util.Scanner;
public class Main21 {
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
            arr [i] = sc.nextDouble();
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
        double total = avg*0.8;
        int num = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<total){
                count[k++] = i+1;
                num++;
            }
        }

        System.out.println("Fleet Size: "+n);
        System.out.printf("Average Fuel Efficiency: %.2f MPG\n",avg);
        System.out.printf("Most Efficient: %.2f MPG (Vehicle %d)\n",max,idx);
        System.out.printf("Least Efficient: %.2f MPG (Vehicle %d)\n",min,index);
        System.out.println("Underperforming Vehicles: "+num);
        System.out.printf("Efficiency Threshold: %.2f MPG\n",total);
        System.out.print("Maintenance Priority: ");
        for(int i=0;i<k;i++){
            System.out.print(count[i]+" ");
        }
        sc.close();
    }
}
