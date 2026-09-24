// 3. Move all zeros to the end

// Input:

// [0, 5, 0, 3, 8, 0, 2]

// Output:

// [5, 3, 8, 2, 0, 0, 0]


import java.util.*;
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        int i = 0;
        int j = 0;
        while(i<n && j<n){
            if(list.get(i)!=0){
                i++;
                j = i;
            }
            else if(list.get(i)==0){
                if(list.get(j)!=0){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
            j++;
        }

        for(int num : list){
            System.out.print(num+" ");
        }

    }
}
