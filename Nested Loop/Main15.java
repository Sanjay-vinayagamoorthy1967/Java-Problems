import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Star Rating Matrix:");
        System.out.println("Product Rating Stars");
        double sum = 0;
        double num = 0;
        for(int i=0;i<n;i++){
            String name = sc.next();
            double n1 = sc.nextDouble();
            sum += n1;
            System.out.print(name+" ");
            System.out.print(n1+" ");
            int number = (int)n1;
            for(int j=0;j<number;j++){
                System.out.print("$ ");
                num++;
            }
            for(int k=0;k<5-num;k++){
                System.out.print("# ");
            }
            System.out.println();
            num = 0;
        }
        double average = sum/n;
        System.out.printf("%.2f",average);
        sc.close();
    }
}
