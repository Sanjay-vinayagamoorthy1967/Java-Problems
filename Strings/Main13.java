import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str = sc.next();
            String result = ""; 
            int j=0;
            while(j<str.length()){
                char ch = str.charAt(j);
                if(ch == 'T'){
                    result += 'U';
                }else{
                    result += ch;
                }
                j++;
            }
            System.out.println(i+1 + ". "+ str + " -> " + result);
        }
        sc.close();
    }
}
