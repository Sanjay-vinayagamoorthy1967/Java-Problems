import java.util.*;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }

        for(int num : list1){
            if(!(list2.contains(num))){
                list2.add(num);
            }
        }
        for(int number : list2){
            System.out.print(number+" ");
        }
    }    
}
