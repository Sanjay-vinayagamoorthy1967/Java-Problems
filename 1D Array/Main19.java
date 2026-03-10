import java.util.*;
public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int idx = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int n1 = sc.nextInt();
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
                idx = i+1;
            }
            if(arr[i]<n1){
                count++;
            }
        }
        double avg = sum/n;
        double total = n-count;
        double goal = total/n*100;
        System.out.println("Days Tracked: "+n);
        System.out.println("Total Calories Burned: "+sum);
        System.out.printf("Average Daily Burn: %.2f\n",avg);
        System.out.println("Peak Burn Day: Day "+idx+" ("+max+" calories)");
        System.out.println("Days Below Target: "+count);
        System.out.printf("Goal Achievement: %.2f%%",goal);
        sc.close();
    }
}
