import java.util.ArrayList;
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums1 = {1,2,2,3,4,5,6};
        int[] nums2 = {2,3,4,5,6,7,8,9};
        ArrayList<Integer> union = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                if(union.size()==0
                || union.get(union.size()-1) != nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }else{
                if(union.size()==0 ||
                union.get(union.size()-1) != nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }
        }

        while (i<nums1.length) {
            if(union.get(union.size() -1)!=nums1[i]){
                union.add(nums1[i]);
            }
            i++;
        }

        while (j<nums1.length) {
            if(union.get(union.size() -1)!=nums2[j]){
                union.add(nums2[j]);
            }
            j++;
        }

        System.out.println(union);
    }
}
