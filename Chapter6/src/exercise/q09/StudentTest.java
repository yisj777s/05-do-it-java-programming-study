package exercise.q09;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("이길동");
        Student studentKim = new Student("김길동");

        studentLee.showInfo();
        studentKim.showInfo();
    }
}
