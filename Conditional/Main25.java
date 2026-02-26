import java.util.Scanner;
public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dataGB = sc.nextDouble();
        int callMinutes =sc.nextInt();
        String internationalUsage = sc.next();
        String deviceType = sc.next();
        System.out.println(dataGB);
        System.err.println(callMinutes);
        System.err.println(internationalUsage);
        System.out.println(deviceType);
        sc.close();
    }
}
