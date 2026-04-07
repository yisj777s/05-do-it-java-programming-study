package cooperation;

public class Student {
    private String studentName;
    private int grade; // 학년
    private int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(studentName + " 님의 남은 돈은 " + money + "입니다.");
    }
}
