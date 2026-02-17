import java.util.Scanner;

public class Main25 {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int resUsage  = sc.nextInt();
        int resRate = sc.nextInt();
        int comUsage = sc.nextInt();
        int comRate = sc.nextInt();
        int connection = sc.nextInt();
        int penalty = sc.nextInt();
        int maintenance = sc.nextInt();
        int treatment = sc.nextInt();
       
        int NetRevenue =(resUsage * resRate)+ (comUsage * comRate);
        int rate = NetRevenue + connection + penalty;
        int total = rate - maintenance;
        int tot = total - treatment;

        
        System.out.println(tot);  
    }  
}
