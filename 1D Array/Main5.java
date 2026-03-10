import java.util.*;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
       
        for(int i=0;i<n;i++){
            arr [i] = sc.nextDouble();
            if(arr[i]>max){
                max = arr[i];  
            }
            if(arr[i]<min){
                min = arr[i];
            } 
        }
        double range = max-min;
        double avg = range/max*100;
        System.out.println("Number of Sellers: "+n);
        System.out.printf("Lowest Price: $%.2f\n",min);
        System.out.printf(" Highest Price: $%.2f\n",max);
        System.out.printf("Price Difference: $%.2f\n",range);
        System.out.printf("Savings: %.2f%%\n",avg);
        sc.close();
    }
}
