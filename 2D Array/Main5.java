import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] temp = new int[r][c];
        int sum = 0;
        int idx=0,index=0;
        int ind=0,inde=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Temperature Grid:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[i][j] = sc.nextInt();
                sum += temp[i][j];
                System.out.print(temp[i][j]+" ");
                if(temp[i][j]>max){
                    max = temp[i][j];
                    idx = i;
                    index = j;
                }
                if(temp[i][j]<min){
                    min = temp[i][j];
                    ind = i;
                    inde = j;
                }
            }
             System.out.println();
        }
        int total = r*c;
        double avg = ((double)sum)/total;
        System.out.println("Maximum Temperature: "+max+"°C at position ("+idx+(",")+index+")");
        System.out.println("Minimum Temperature: "+min+"°C at position ("+ind+(",")+inde+")");
        System.out.printf("Average Temperature: %.2f°C",avg);
        sc.close();
    }   


}
