import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        
        for(int i=1;i<=r;i++){
            System.out.print("Row "+i+": ");
            for(int j=1;j<=c;j++){
                count++;
                System.out.print("Seat-"+j+" ");
            }
            System.out.println();
        }
        System.out.println("Total Seats: "+count);
        sc.close();
    }
}
