package practice;

/**
 * if-else if-else문으로 성적에 따라 학점 부여하기
 */
public class Q08 {
    public static void main(String[] args) {
        int score = 95;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(grade + "학점입니다.");
    }
}
