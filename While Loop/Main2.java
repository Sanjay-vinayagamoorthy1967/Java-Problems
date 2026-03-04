import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total =0;
        int count = -1;
        boolean sum =true;
        while(sum){
            int n = sc.nextInt();
            System.out.println("Enter number (0 to stop): "+n);
            total +=n;
            count++;
            if(n==0){
                sum = false;
            }
        }
            System.out.println("Total sum: "+total);
            System.out.println("count: "+count);
            sc.close();
    }
}
