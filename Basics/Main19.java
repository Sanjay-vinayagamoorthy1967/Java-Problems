import java.util.Scanner;
public class Main19 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int rent = sc.nextInt();
        int late = sc.nextInt();
        int fuel = sc.nextInt();
        int maintenanceCost = sc.nextInt();
        int Profit =(rent * days) + late - fuel - maintenanceCost;
        
        System.out.println(Profit);  
    } 
    
}
