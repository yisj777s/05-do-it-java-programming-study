package object;

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId + "," + studentName;
    }
}

public class EqualsTeset {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee; // 참조값 복사
        Student studentSang = new Student(200, "이상원");

        if (studentLee == studentLee2) {
            System.out.println("studentLee와 studentLee2의 참조값은 같습니다.");
        } else {
            System.out.println("studentLee와 studentLee2의 참조값은 다릅니다.");
        }

        if (studentLee.equals(studentLee2)) {
            System.out.println("studentLee와 studentLee2는 동등합니다.");
        } else {
            System.out.println("studentLee와 studentLee2는 동등하지 않습니다.");
        }

        if (studentLee == studentSang) {
            System.out.println("studentLee와 studentSang의 참조값은 같습니다.");
        } else {
            System.out.println("studentLee와 studentSang의 참조값은 다릅니다.");
        }

        if (studentLee.equals(studentSang)) {
            System.out.println("studentLee와 studentSang은 동등합니다.");
        } else {
            System.out.println("studentLee와 studentSang은 동등하지 않습니다.");
        }
    }
}

