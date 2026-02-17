import java.util.Scanner;

public class Main16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int genPass = sc.nextInt();
        int genFare = sc.nextInt();
        int acPass = sc.nextInt();
        int acFare = sc.nextInt();
        int platform = sc.nextInt();
        int maintenance = sc.nextInt();
        int fuel = sc.nextInt();
        int NetRevenue =(genPass * genFare)+ (acPass * acFare);
        int fina = NetRevenue + platform;
        int total = fina - maintenance;
        int tot = total-fuel;
        System.out.println(tot);  
    } 
}
