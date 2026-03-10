import java.util.*;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        double sum = 0;
        int idx = 0;
        int index = 0;
        for(int i=0;i<n;i++){
            arr [i] = sc.nextDouble();
            if(arr[i]>max){
                max = arr[i];
                idx = i+1;  
            }
            if(arr[i]<min){
                min = arr[i];
                index = i+1;
            }
            sum += arr[i];
        }
        
        double avg = sum/n;
        System.out.println("Total Stores: "+n);
        System.out.printf("Highest Sales: $%.2f (Store %d)\n",max,idx);
        System.out.printf("Lowest Sales: $%.2f (Store %d)\n",min,index);
        System.out.printf("Total Sales: $%.2f\n",sum);
        System.out.printf("Average Sales: $%.2f\n",avg);
        sc.close();
    }
}
