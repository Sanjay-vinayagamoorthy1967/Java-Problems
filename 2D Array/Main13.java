import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int num = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
                num++;
            }
        }
        System.out.println("Seating Map: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[] index = new int[r];
        int k = 0;
        int count = 0;
        for(int i=0;i<r;i++){
            int count1 = 0;
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    count++;
                }else{
                    count1++;
                }
            }
            if(count1 == c){
                index[k++] = i;
            }

        }
        double avg = ((double)count)/num*100;
        System.out.println("Total Occupied: "+count);
        System.out.printf("Occupancy Rate: %.2f%%\n",avg);
        System.out.print("Empty Rows: ");
        for(int i=0;i<k;i++){
            System.out.print(index[i]+" ");
        }
        sc.close();
    }
}
