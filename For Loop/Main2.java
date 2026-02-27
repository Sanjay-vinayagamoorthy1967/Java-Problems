import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum=0;
        int HighestScore = 0;
        int count=0;
        int num=0;
        for(int i=0;i<n;i++){
            char LetterGrade = 0;
            String studentName = sc.next();
            int score = sc.nextInt();
            if(score>=85 && score<=100){
                LetterGrade = 'A';
            }else if(score>=70 && score<=84){
                LetterGrade = 'B';
            }else if(score>=60 && score<=69){
                LetterGrade = 'C';
            }else if(score>=50 && score<=59){
                LetterGrade = 'D';
            }else if(score>=0 && score<=49){
                LetterGrade = 'E';
            }
            System.out.println();
            System.out.println("Student: "+studentName);
            System.out.println("Score: "+score);
            System.out.println("Letter Grade: "+LetterGrade);
            if(score>=60){
                System.out.println("Status: Pass");
                count++;
            }else{
                System.out.println("Status: Fail");
                num++;
            }
             sum = sum + score;
             if(score>HighestScore){
                HighestScore = score;
             }
             
        }
            System.out.println();
            float Average = sum/n;
            System.out.println("Total Students: "+n);
            System.out.printf("Class Average: %.2f\n",Average);
            System.out.println("Highest Score: "+HighestScore);
            System.out.println("Students Passed: "+count);
            System.out.println("Students Failed: "+num);
            sc.close();
    }
}
