package exercise.q08;

public class Student {
    private String name;
    private int money;
    private String lastTaxi;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi, int money) {
        taxi.takePassenger(money);
        lastTaxi = taxi.getName();
        this.money -= money;
    }

    public void showInfo() {
        System.out.println(name + "학생이 " + lastTaxi + "택시를 탔습니다. 남은 돈은 " + money
        + "원입니다.");
    }
}
