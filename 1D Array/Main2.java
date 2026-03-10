import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int count = 0;
        int k = 0;
        int []idx = new int[n];
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num<n1){
                count++;
                idx[k++] = i; 
            }
        }
        System.out.println("Total Products: "+n);
        System.out.println("Minimum Threshold: "+n1);
        System.out.println("Low Stock Products: "+count);
        System.out.print("Product Indices: ");
        for(int i=0;i<k;i++){
            System.out.print(idx[i]+" ");
        }
        sc.close();
    }
}
