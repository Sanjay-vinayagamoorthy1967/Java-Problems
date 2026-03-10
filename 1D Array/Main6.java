import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr = new double[n];
        double sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        double avg = sum/n;
        double mul = avg*2;
        int count =0;
        int [] idx = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>mul){
                count++;
                idx[k++] = i;
            }
        }
        System.out.println("Total Transactions: "+n);
        System.out.printf("Average Transaction: $%.2f\n",avg);
        System.out.println("Suspicious Transactions: "+count);
        System.out.print("Fraud Alert Indices: ");
        for(int i=0;i<k;i++){
            System.out.print(idx[i]+" ");
        }
        sc.close();
    }
}
