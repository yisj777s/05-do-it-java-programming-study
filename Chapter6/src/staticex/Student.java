package staticex;

public class Student {
    static int serialNum = 1000;
    private int studentID;
    private String studentName;
    private int grade;
    private String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }
}
