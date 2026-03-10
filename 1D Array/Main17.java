import java .util.Scanner;
public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        int count = 0;
        double sum = 0;
        int k =0;
        int [] idx = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]<6.5 || arr[i]>8.5){
                count++;
                idx [k++] = i+1; 
            }
        }
        double avg = sum/n;
        int total = n-count;
        double safety = (double)(total)/n*100;
        System.out.println("Total Samples: "+n);
        System.out.printf("Average pH: %.2f\n",avg);
        System.out.printf("Minimum pH: %.2f\n",min);
        System.out.printf("Maximum pH: %.2f\n",max);
        System.out.println("Unsafe Samples: "+count);
        System.out.printf("Safety Compliance: %.2f%%\n",safety);
        System.out.printf("Critical Alerts: ");
        for(int i=0;i<k;i++){
            System.out.print(idx[i]+" ");
        }
        sc.close();
    }
}
