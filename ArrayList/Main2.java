import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.next());
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr.get(i)+" ");
        // }
        System.out.println(arr);
    }
}
