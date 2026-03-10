import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double total = 0;
        int max = Integer.MIN_VALUE;
        int idx = 0;
        int[] index = new int[n];
        for(int i=0;i<n;i++){
            arr [i] = sc.nextInt();
            total += arr[i];
            if(arr[i]>max){
                max = arr[i];
                idx = i+1;
            }
        }
        double avg = total/n;
        double threshold = avg*0.5;
        int count = 0;
        int k = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<threshold){
                count++;
                index[k++] = i+1;
            }
        }
        System.out.println("Total Products: "+n);
        System.out.println("Total Units Sold: "+total);
        System.out.printf("Average Monthly Sales: %.2f\n",avg);
        System.out.printf("Best Seller: Product %d (%d units)\n",idx,max);
        System.out.println("Slow-Moving Products: "+count);
        System.out.printf("Turnover Threshold: %.2f units\n",threshold);
        System.out.print("Clearance Candidates: ");
        for(int i=0;i<k;i++){
            System.out.print(index[i]+" ");
        }
        sc.close();
    }
}
