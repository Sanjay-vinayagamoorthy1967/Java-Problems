import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> arr = new LinkedList<Integer>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        } 
        arr.add(2,25);
        arr.remove(Integer.valueOf(40));

        Iterator<Integer> ar = arr.iterator();    
  
        while(ar.hasNext()){
            System.out.println(ar.next());
        }
           
        System.out.println();
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());

    }
}
