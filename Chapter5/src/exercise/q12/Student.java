package exercise.q12;

/**
 * Q12.
 * 163~165쪽에서 만든 Student와 StudentTest 클래스를 사용하여 접근 제어자를 테스트해 봅시다.
 * Chapter5 패키지 폴더 아래에 test 패키지를 만들고 그곳으로 studentTest 클래스를 옮깁니다.
 * 그러면 StudentTest 클래스에 오류가 발생합니다.
 * Student 클래스의 멤버 변수에 접근 제어자를 변경하여 오류를 수정하세요.
 */
public class Student {
    int studentID;
    private String studentName;
    int grade;
    public String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
