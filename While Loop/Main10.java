import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int l = 1;
        System.out.println("Fibonacci sequence ("+n+" terms):t");
        for(int i=0;i<n;i++){ 
            System.out.print(f+" ");
            int num = f+l;
            f = l;
            l = num;
        }
        sc.close();
    }
}
