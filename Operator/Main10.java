import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitsConsumed  = sc.nextInt();
        int voltageFluctuation = sc.nextInt();
        if(unitsConsumed  > 500 || voltageFluctuation == 1){
            System.out.println("Alert");
        }else{
            System.out.println("Normal");
        }
    }
}
