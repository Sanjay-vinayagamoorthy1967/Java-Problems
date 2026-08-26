import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            boolean b = true;
            for(int j=i+1;j<n;j++){
                if(arr.get(i)==arr.get(j)){
                    b = false;
                }
            }
            if(b){
                System.out.print(arr.get(i)+" ");
            }
        }
    }
}
