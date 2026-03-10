import java.util.Scanner;
public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = 0;
        int[] same = new int[n];
        int sum = 0;
        int idx = 0;
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
                idx = i+1;
            }
        }
        double avg = (double)sum/n;
        double total = avg*0.9;
        int num = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<total){
                same[k++] = i+1;
                num++;
            }
        }
        System.out.println("Production Lines: "+n);
        System.out.println("Total Output: "+sum+" units");
        System.out.printf("Average Output: %.2f units/hour\n",avg);
        System.out.printf("Top Producer: Line %d (%d units)\n",idx,max);
        System.out.println("Underperforming Vehicles: "+num);
        System.out.printf("Performance Threshold: %.2f units\n",total);
        System.out.print("Priority Lines: ");
        for(int i=0;i<k;i++){
            System.out.print(same[i]+" ");
        }
        sc.close();
    }
}
