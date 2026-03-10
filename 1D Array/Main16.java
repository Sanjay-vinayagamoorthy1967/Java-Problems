import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        int index = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
                index = i+1;
            }
        }
        int avg = sum/n;
        int count = 0;
        int[] idx = new int[n];
        int k=0;
        int threshold = (avg*150)/100;
        for(int i=0;i<n;i++){
            if(arr[i]>threshold){
                count++;
                idx[k++] = i+1;
            }
        }
        System.out.println("Trading Days Analyzed: "+n);
        System.out.println("Total Volume: "+sum);
        System.out.println("Average Daily Volume: "+avg);
        System.out.println("Peak Volume Day: Day "+index+" ("+max+")");
        System.out.println("High Volume Days (>150% avg): "+count);
        System.out.print("Breakout Signal Days: ");
        for(int i=0;i<k;i++){
            System.out.print(idx[i]+" ");
        }
        sc.close();
    }
}
