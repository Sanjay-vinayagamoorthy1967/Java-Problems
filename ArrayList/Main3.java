import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.next());
        }
        int left = 0;
        int right = arr.size()-1;
        while(left < right){
            String temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right,temp);
            left++;
            right--;
        }
        System.out.print(arr);
    }
}
