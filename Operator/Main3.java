import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int working = sc.nextInt();
        int attendance = sc.nextInt();
        if(working>40 && attendance>90){
            System.out.println("Bonus Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
