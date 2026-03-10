import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int count = 0;
        int sum1 =0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                
            }
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>200){
                count++;
            }    
            sum1 += arr[i];       
        }
        double sum = n-count;
        double avg = (sum/n)*100;
        double average = (double)sum1/n;
        System.out.println("Total Servers: "+n);
        System.out.println("Fastest Response: "+min+"ms");
        System.out.println("Slowest Response: "+max+"ms");
        System.out.printf("Average Response: %.2fms\n",average);
        System.out.println("Slow Servers (>200ms): "+count);
        System.out.printf("Average Response: %.2f%%",avg);
        sc.close();
    }
}
