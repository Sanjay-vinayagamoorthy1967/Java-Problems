import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        
        int max = 0;
        int idx=0,index=0;
        int total = r*c;
        int sum = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                if(arr[i][j]>max){
                    max = arr[i][j];
                    idx = i;
                    index = j;
                }
            }
           
        }
        double avg = (double)sum/total;
        System.out.println("Total Inventory: "+sum);
        System.out.println("Max Stock Zone: Row "+idx+" , Col "+index+" ("+max+" units)");
        System.out.printf("Average Stock per Zone: %.2f",avg);
        sc.close();
    }
}
