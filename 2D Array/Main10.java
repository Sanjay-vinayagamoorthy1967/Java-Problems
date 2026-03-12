import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println();
        System.out.println("Sales Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int idx = 0;
        System.out.println();
        System.out.println("Representative Totals:");
        for(int i=0;i<r;i++){
            int sum = 0;
            for(int j=0;j<c;j++){
                sum += arr[i][j];
                idx = i+1;
            }
            System.out.print("Rep "+idx+": "+sum);
            System.out.println();
            
        }
        System.out.println();
        System.out.println("Territory Totals:");
        int index = 0;
        for(int k=0;k<c;k++){
            int num = 0;
            for(int l=0;l<r;l++){
                num +=arr[l][k];
                index = k+1;
            }
            System.out.print("Territory "+index+": "+num);
            System.out.println();    
        }
        sc.close();  
        
    }
}
