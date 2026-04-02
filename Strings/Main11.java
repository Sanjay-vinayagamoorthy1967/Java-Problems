import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String result = "";
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                if(ch == '\''){
                    result += "\"";
                }else{
                    result += ch;
                }
            }
            System.out.println(i+1 + ". " + str + " -> " + result);
        }
        sc.close();
    }
}