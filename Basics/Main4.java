import java.util.Scanner;

public class Main4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuitionFees = sc.nextInt();
        int scholarship   = sc.nextInt();
        int examFee = sc.nextInt();
        int libraryFee = sc.nextInt();
        int percentage = (tuitionFees*scholarship)/100;
        int total = (tuitionFees+examFee+libraryFee)-percentage;
        System.out.println(total);
        
    }
}


   