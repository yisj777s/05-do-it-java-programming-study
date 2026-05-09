package exercise.q09;

public class Student {
    private static int serialNumber = 1000;
    private int studentID;
    private int studentCardNumber;
    private String name;

    public Student(String name) {
        this.name = name;
        serialNumber++;
        studentID = serialNumber;
        studentCardNumber = studentID + 100;
    }

    public void showInfo() {
        System.out.println(name + " 학생의 학번은 " + studentID + ", 카드 번호는 " +
                studentCardNumber + "입니다.");
    }
}
