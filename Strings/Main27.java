import java.util.*;

public class Main27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        String str1 = "";
        int num = 0;
        for(int i=0;i<str.length;i++){
            int count = 0;
            for(int j=0;j<str.length;j++){
                if(str[i].equals(str[j])){
                    count++;
                }
            }
            if(count > num){
                    str1 = str[i];
                    num = count;
            }
        }
        System.out.print(str1+" "+num);
        
    }
    sc.close();
}