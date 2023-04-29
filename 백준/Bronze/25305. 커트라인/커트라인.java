import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int student_GradeNum = sc.nextInt();
        int[] grade = new int[student];
        for(int i=0; i<student; i++){
            grade[i] = sc.nextInt();

        }
        Arrays.sort(grade);
        System.out.println(grade[student-student_GradeNum]);

    }
}