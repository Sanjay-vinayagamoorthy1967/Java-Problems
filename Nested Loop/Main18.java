import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Class Time Table:");
        System.out.print("Day ");
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=1;i<=c;i++){
            System.out.print("Period"+i+" ");
        }
        System.out.println();
        for(int i=0;i<r;i++){
            System.out.print(days[i]+" ");
            for(int j=0;j<c;j++){
                String name = sc.next();
                System.out.print(name+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
