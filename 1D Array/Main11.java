import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr1 = new double[n];
        double[] arr2 = new double[n];
        double[] arr3 = new double[n];
        int k=0;
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        int idx = 0;
        int index = 0;
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextDouble();
        }
        
        for(int i=0;i<n;i++){
            arr3[k++] = arr1[i]*arr2[i];
            sum += arr3[i];
            if(arr3[i]>max){
                max = arr3[i];
                idx = i+1;
            }
            if(arr3[i]<min){
                min = arr3[i];
                index = i+1;
            }
        }
        System.out.println("Number of Assets: "+n);
        System.out.printf("Total Portfolio Value: $%.2f\n",sum);
        System.out.printf("Most Valuable Asset: Asset %d ($%.2f)\n",idx,max);
        System.out.printf("Least Valuable Asset: Asset %d ($%.2f)",index,min);
        sc.close();
    }
}
