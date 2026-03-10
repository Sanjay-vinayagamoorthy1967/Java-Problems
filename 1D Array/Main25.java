import java.util.Scanner;
public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] count = new int[n];
        int k = 0;
        
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
        }
        double avg = (double)sum/n;
        double total = avg*2.0;
        int num = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>total){
                count[k++] = i+1;
                num++;
            }
        }

        System.out.println("Security Events Analyzed: "+n);
        System.out.printf("Average Risk Score: %.2f\n",avg);
        System.out.printf("Highest Risk Event: %d (Event %d)\n",max,idx);
        System.out.printf("Lowest Risk Event: %d (Event %d)\n",min,index);
        System.out.println("Critical Threats (>200% avg): "+num);
        System.out.printf("Threat Threshold: %.2f\n",total);
        System.out.print("Alert Events: ");
        for(int i=0;i<k;i++){
            System.out.print(count[i]+" ");
        }
        sc.close();
    }
}
