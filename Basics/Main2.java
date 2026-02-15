import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baseCost = sc.nextInt();
        int extraGB = sc.nextInt();
        int ratePerGB = sc.nextInt();
        int tax = sc.nextInt();
        int extra = extraGB*ratePerGB;
        float total = baseCost+extra;
        float percentage = (total*tax/100);
        float tot = total+percentage;
        System.out.println(tot);
    }
}
