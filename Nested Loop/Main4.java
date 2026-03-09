import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        double num = 0;
        double mark = 0;
        System.out.println("Grade Sheet:");
        System.out.print("Student ");
        for(int i=1;i<=n1;i++){
            System.out.print("Sub"+i+" ");
        }
        System.out.println("Average");
        for(int i=0;i<n;i++){
            String name = sc.next();
            System.out.print(name+" ");
            for(int j=0;j<n1;j++){
                mark = sc.nextInt();
                num += mark;
                System.out.print((int)mark+" ");
            }
            double avg = num/n1;
            System.out.printf("%.2f",avg);
            avg = 0;
            num = 0;
            System.out.println();
        }
        sc.close();
    }
}
