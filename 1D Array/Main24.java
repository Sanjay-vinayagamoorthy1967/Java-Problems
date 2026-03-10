import java.util.Scanner;
public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double sum = 0;
        int index=0,idx = 0;
        for(int i=0;i<n;i++){
            arr [i] = sc.nextDouble();
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
        double avg = sum/n;
        double total = avg*0.7;
        double tot = avg*1.5;
        int num = 0;
        int num1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<total){
                num++;
            }if(arr[i]>tot){
                num1++;
            }
        }

        System.out.println("Total Properties: "+n);
        System.out.printf("Portfolio Value: $%.2f\n",sum);
        System.out.printf("Average Property Value: $%.2f\n",avg);
        System.out.printf("Most Valuable: $%.2f (Property %d)\n",max,idx);
        System.out.printf("Least Valuable: $%.2f (Property %d)\n",min,index);
        System.out.println("Bargain Properties (<70% avg): "+num);
        System.out.println("Premium Properties (>150% avg): "+num1); 
        sc.close();
    }
}
