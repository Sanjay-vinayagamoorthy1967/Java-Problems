import java.util.Scanner;
public class Main3 {
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
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                
            }
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]<40){
                count++;
            }           
        }
        double sum = n-count;
        double avg = (sum/n)*100;
        System.out.println("Total Students: "+n);
        System.out.println("Highest Score: "+max);
        System.out.println("Lowest Score: "+min);
        System.out.println("Failed Students: "+count);
        System.out.printf("Pass Percentage: %.2f%%",avg);
        sc.close();
    }
}
