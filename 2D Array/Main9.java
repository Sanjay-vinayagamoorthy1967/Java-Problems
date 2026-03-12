import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Elevation Map: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
            System.out.println();
        }
        int total = max-min;
        System.out.println("Highest Point: "+max+" m");
        System.out.println("Lowest Point: "+min+" m");
        System.out.printf("Elevation Range: %02d m",total);
        sc.close();
    }
}
