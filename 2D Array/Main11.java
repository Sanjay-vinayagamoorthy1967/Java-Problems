import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        
        int idx =0;
        int index = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
         for(int i=0;i<r;i++){
            idx = 0;
            index = 0;
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    idx = i;
                    index = j;
                    arr[i][j]=0;
                    break;
                }
                
            }
           
        }
                for(int k=0;k<r;k++){
                   int in = 0;
                    int out = 0;
                    for(int l=0;l<c;l++){
                        if(arr[k][l]==1){
                            in = k;
                            out = l+1;
                            arr[k][l] = 0;
                            break;
                        }
                        System.out.println("- Seat at ("+idx+(","+index+") is too close to ("+in+","+out+")"));
                    }
                      
                }
                 for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                 }
                 sc.close();
    }
}               