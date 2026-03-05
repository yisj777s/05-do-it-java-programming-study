package classpart;

public class Student {
    int studentID; // 학번
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," +address);
    }
}
