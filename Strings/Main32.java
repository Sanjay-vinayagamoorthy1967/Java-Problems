// import java.util.*;

// public class Main32 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         String fin = "";
//         char c = s.charAt(0);
//         String curr = "";
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(ch == c){
//                 curr += ch;
//                 c++;
//             }else{
//                 if(curr.length()>fin.length()){
//                     fin = curr;
//                 }
//                 curr = "";
//                 curr += ch;
//                 c = ch;
//                 c++;
//             }
//         }
//         if (curr.length() > fin.length()) {
//             fin = curr;
//         }
//         System.out.print(fin);
//     }
// }


import java.util.*;

public class Main32{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int start = 0;
        int max = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            
            int len = j-i+1;
            if(len>max){
                max = len;
                start = i;
            }
            j++;
        }
        System.out.print(s.substring(start,start+max));
    }
}