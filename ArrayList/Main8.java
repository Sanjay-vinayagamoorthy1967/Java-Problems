import java.util.Scanner;
import java.util.ArrayList;
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 3, 4, 5, 7};
        int[] b = {1, 2, 4, 6, 7};
        ArrayList<Integer> inter = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else{
                if(inter.size() == 0 || inter.get(inter.size()-1) != a[i]){
                    inter.add(a[i]);
                    i++;
                    j++;
                }
            }
        }
        System.out.print(inter);
    }
}
