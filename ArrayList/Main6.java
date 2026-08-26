import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<n1;i++){
            arr1.add(sc.nextInt());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr.get(i) == arr1.get(j)){
                    arr2.add(arr.get(i));
                }
            }
        }
        System.out.print(arr2+" ");
        
    }
}
