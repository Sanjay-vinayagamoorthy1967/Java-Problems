import java.util.Scanner;

public class Main5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBill = sc.nextInt();
        int service   = sc.nextInt();
        int gst = sc.nextInt();
        int numberOfPeople = sc.nextInt();
        float percentage = (totalBill*service)/100;
        float per = (totalBill*gst)/100;
        float total = totalBill+percentage+per;
        float tot = total/numberOfPeople;
        System.out.println(tot);
        
    }
}


   