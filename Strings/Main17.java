import java.util.Scanner;
import java.util.Stack;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String str = sc.next();
            Stack<Character> stack = new Stack<>();
            boolean isvalid = true;
            for(char ch : str.toCharArray()){
                if(ch=='{' || ch=='[' || ch=='('){
                    stack.push(ch);
                }else if(ch=='}' || ch==']' || ch==')'){
                    if(stack.isEmpty()){
                        isvalid = false;
                        break;
                    }
                    char top = stack.pop();

                    if(ch=='}' && top!='{' || ch==']' && top!='[' || ch==')' && top!='('){
                        isvalid = false;
                        break;
                    }
                }
            }
        if (!stack.isEmpty()) {
                     isvalid = false;
                     }
        if (isvalid) {
                System.out.println(i + ". " + str + " -> Valid");
            } else {
                System.out.println(i + ". " + str + " -> Invalid");
            }
        }
        sc.close();
    }
}
