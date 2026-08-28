import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> valid = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                valid.push(s.charAt(i));
            }else{
                if((valid.isEmpty())){
                    System.out.print("False");
                    return;
                }
                if(s.charAt(i) == '}' && valid.peek()=='{' ||
                   s.charAt(i) == ']' && valid.peek()=='[' ||
                   s.charAt(i) == ')' && valid.peek()=='('){
                        valid.pop();
                   }else{
                        System.out.print("False");
                        return;
                   }
            }
        }
        if(valid.isEmpty()){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}