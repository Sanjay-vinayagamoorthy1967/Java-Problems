import java.util.Scanner;

public class Main8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rodsPerHour = sc.nextInt();
        int hoursWorked = sc.nextInt();
        int overtimeRods = sc.nextInt();
        int rejectedRods = sc.nextInt();
        int FinalProduction = (rodsPerHour * hoursWorked) + overtimeRods - rejectedRods;
        System.err.println(FinalProduction);  
    } 
}
