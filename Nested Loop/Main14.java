import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int name = sc.nextInt();
        int count = 0;
        int total = r*c;
        int num=1;
        for(int i=1;i<=r*2;i++){
            for(int j=1;j<=c;j++){
                if(j%2!=0 && i%2!=0 || i%2==0 && j%2==0){
                    if(num<=name){
                        System.out.printf("S%03d ",num);
                        num++;
                        count++;
                    }else{
                        System.out.print("---- ");
                    }
                }else{
                    System.out.print("---- ");
                }
            }
            System.out.println();
        }
        int empty = total-count;
        System.out.println("Total Seats: "+total);
        System.out.println("Occupied Seats: "+count);
        System.out.println("Empty Seats: "+empty);
        sc.close();
    }
}
