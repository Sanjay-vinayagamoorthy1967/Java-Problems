import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
                arr[n1][n2] = 1;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int total = r*c;
        int occupied = n;
        int vacant = total-occupied;
        double rate = ((double)occupied/total)*100;
        System.out.println("Total Spots: "+total);
        System.out.println("Occupied: "+occupied);
        System.out.println("Vacant: "+vacant);
        System.out.printf("Occupancy Rate: %.2f%%",rate);
        sc.close();
    }
}
