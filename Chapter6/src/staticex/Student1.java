package staticex;

public class Student1 {
    static int serialNum = 1000;
    int studentID;
    String studentName;
    private int grade;
    private String address;

    public Student1() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }
}
