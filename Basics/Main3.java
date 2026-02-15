import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sales = sc.nextInt();
        int discount   = sc.nextInt();
        int gst = sc.nextInt();
        float dis = (sales*discount/100);
        float total = sales-dis;
        float add = (total*gst/100);
        float tot = total+add;
        System.out.println(tot);
        
    }
}
