import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int v = sc.nextInt();
        
        System.out.println("Price Comparison Matrix:");
        for(int i=1;i<=v;i++){
            if(i==1){
                System.out.print("Product"+" ");
            }
            System.out.print("Vendor"+i+" ");
            if(i==v){
                System.out.println("BestPrice");
            }
        }
        for(int i=0;i<p;i++){
            float large = Float.MAX_VALUE;
            String name = sc.next();
            System.out.print(name+" ");
            for(int j=0;j<v;j++){
                float n1 = sc.nextFloat();
                System.out.printf("%.2f ",n1);
                if(n1<large){
                    large = n1;
                }
            }
            System.out.printf("%.2f\n",large);
            
            
        }
        sc.close();
    }
}
