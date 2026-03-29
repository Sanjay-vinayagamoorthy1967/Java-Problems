import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
       
        String [] arr1 = new String[1000];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            int len = arr[i].length();
            int num = 0;
            int count=0;
            int count1=0;
            int count2=0;
            int count3=0;
            for(int j=0;j<len;j++){
                if(arr[i].charAt(j)>='a' && arr[i].charAt(j)<='z'){
                    count++;
                }
                if(arr[i].charAt(j)>='A' && arr[i].charAt(j)<='Z'){
                    count1++;
                }
                if(arr[i].charAt(j)>='0' && arr[i].charAt(j)<='9'){
                    count2++;
                }
                if(!(arr[i].charAt(j)>='0' && arr[i].charAt(j)<='9') && !(arr[i].charAt(j)>='A' && arr[i].charAt(j)<='Z') && !(arr[i].charAt(j)>='a' && arr[i].charAt(j)<='z')){
                    count3++;
                }
            }
            if(count>0 && count1>0 && count2>0 && count3>0 && len>=8){
                System.out.println(i+1+". "+arr[i]+ " -"+"Strong");
            }else{
                if(len<8){
                    arr1[num++] = "Length<8";
                }
                if(count==0){
                    arr1[num++] = "Missing Lower";
                }
                if(count1==0){
                    arr1[num++] = "Missing Upper";
                }
                if(count2==0){
                    arr1[num++] = "Missing Digit";
                }
                if(count3==0){
                    arr1[num++] = "Missing Special char";
                }
                System.out.print(i+1+". "+arr[i]+ " -"+"Weak (");
                for(int l=0;l<num;l++){
                    System.out.print(arr1[l]);
                    if(l!=num-1){
                        System.out.print(",");
                    }
                }
                System.out.println(")");
            }
        }
        sc.close();
    }
}
