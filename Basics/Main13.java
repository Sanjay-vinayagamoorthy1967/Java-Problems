import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yieldPerAcre= sc.nextInt();
        int acres = sc.nextInt();
        int extraYield = sc.nextInt();
        int damagedCrops = sc.nextInt();
        int FinalYield = (yieldPerAcre * acres) + extraYield - damagedCrops;
        System.err.println(FinalYield);  
    } 
}
