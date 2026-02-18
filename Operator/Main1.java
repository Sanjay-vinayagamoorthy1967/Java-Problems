import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float theory = sc.nextInt();
        float practical = sc.nextInt();
        float total = theory+practical;
        float average = (total/2);
        if(theory>=50 && practical>=50){
            if(average>=60){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
        }
        }else{
            System.out.println("Fail");

        }
    }
}
