import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int count1=0;
        double average=0;
        int highestscore = 0;
        for(int i=0;i<n;i++){
            String studentName = sc.next();
            int correctAnswers = sc.nextInt();
            int wrongAnswers = sc.nextInt();
            int unattempted = sc.nextInt();
            int score = (correctAnswers * 4) - (wrongAnswers * 3) + (unattempted * 0);
            String Result = "0";
            if(score>=32){
                Result = "Pass";
                count++;
            }else{
                Result = "Fail";
                count1++;
            }
            average += score;
            if(score>highestscore){
                highestscore = score;
            }
            System.out.println("Student: "+studentName);
            System.out.println("Correct: "+correctAnswers);
            System.out.println("Wrong: "+wrongAnswers);
            System.out.println("Unattempted: "+unattempted);
            System.out.println("Score: "+score);
            System.out.println("Result: "+Result);
        }
            double ClassAverage = average/n;
            System.out.println();
            System.out.println("Total Students: "+n);
            System.err.println("Pass Count: "+count);
            System.out.println("Fail Count: "+count1);
            System.out.println("Class Average: "+ClassAverage);
            System.out.println("Highest Score: "+highestscore);
            sc.close();
    }
}
