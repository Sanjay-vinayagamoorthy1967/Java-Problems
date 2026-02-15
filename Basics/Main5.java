import java.util.Scanner;

public class Main5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalBill = sc.nextInt();
        float service   = sc.nextInt();
        float gst = sc.nextInt();
        float numberOfPeople = sc.nextInt();
        float percentage = (totalBill*service)/100;
        float bill = totalBill+percentage;
        float per = (bill*gst)/100;
        float total = bill+per;
        float tot = total/numberOfPeople;
        System.out.println(tot);
        
    }
}


   
