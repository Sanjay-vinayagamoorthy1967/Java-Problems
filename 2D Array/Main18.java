import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        for(int i=0;i<n;i++){
            int n1 = sc.nextInt();
            arr[i] = new int[n1];
            for(int j=0;j<n1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int idx = -1;
        int[] occ = new int[n];
        System.out.println("Hotel Status:");
        for(int i=0;i<n;i++){
            int count =0;
             System.out.print("Floor "+(i+1)+": ");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]==1){
                    count++;
                }
                
            }
            if(count>max){
                max = count;
                idx = i+1;
            }
            occ[i] = count;
            System.out.println();

        }
        System.out.println("Occupancy Report:");
        for(int i=0;i<n;i++){
            System.out.println("Floor "+(i+1)+": "+occ[i]+" occupied");
        }
        System.out.println("Busiest Floor: Floor "+idx+" ("+max+" rooms occupied)");
        sc.close();
    }
}
