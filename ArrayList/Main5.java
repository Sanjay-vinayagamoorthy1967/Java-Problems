import java.util.*;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int lar = arr.get(0);
        int sec = 0;
        for(int i=0;i<n;i++){
            if(arr.get(i)>lar){
                sec = lar;
                lar = arr.get(i);
            }else if(arr.get(i)<lar && arr.get(i)>sec){
                sec = arr.get(i);
            }
        }
        System.out.println(sec);
    }
}
