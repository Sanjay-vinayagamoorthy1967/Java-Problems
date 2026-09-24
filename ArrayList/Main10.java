// 2. Find the second smallest element

// Input:

// [20, 5, 15, 8, 30, 5]

// Output:

// Second Smallest: 8



import java.util.*;

public class Main10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int max = list.get(0);
        int sec = 0;

        for(int num : list){
            if(num<max){
                sec = max;
                max = num;
            }else if(num>max && num<sec){
                sec = num;
            }
        }
        System.out.print(sec);

    }
}
