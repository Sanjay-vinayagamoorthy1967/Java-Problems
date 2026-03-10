import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int [] idx = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>n1){
                count++;
                idx[k++] = i+1;
            }
        }
        double total = (n-(double)count)/n*100;
        System.out.println("Production Lines: "+n);
        System.out.println("Acceptable Threshold: "+n1);
        System.out.println("Lines Exceeding Threshold: "+count);
        System.out.print("Critical Lines: ");
        for(int i=0;i<k;i++){
            System.out.print(idx[i]+" ");
        }
        System.out.println();
        System.out.printf("Compliance Rate: %.2f%%",total);
        sc.close();
    }
}
