import java.util.Scanner;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        double count = 0;
        double count1=0;
        String[][] arr = new String[r][c];
        for(int k=0;k<n;k++){
            int s = sc.nextInt();
            int s1 = sc.nextInt();
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    arr[s][s1] = "B";
                }
            }
        }
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(arr[i][j]!="B"){
                        arr[i][j] = "A";
                        count1++;
                    }else{
                        count++;
                    }
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        double total = r*c;
        double occupancy = (count/total)*100;
        
        System.out.println("Total Seats: "+(int)total);
        System.out.println("Booked Seats: "+(int)count);
        System.out.println("Available Seats: "+(int)count1);
        System.out.printf("Occupancy Rate: %.2f%%",occupancy);
        sc.close();
    }
}