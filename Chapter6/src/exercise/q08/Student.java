package exercise.q08;

public class Student {
    private String name;
    private int money;
    private Taxi lastTaxi;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        if (money < taxi.getFare()) {
            System.out.println(name + "학생이 " + taxi.getName() + "택시를 탈 돈이 부족합니다.");
            return;
        }
        System.out.println(name + "학생이 " + taxi.getName() + "택시를 탔습니다.");
        int fare = taxi.takePassenger();
        this.money -= fare;
        this.lastTaxi = taxi;
    }

    public void showInfo() {
        if (lastTaxi == null) {
            System.out.println(name + "학생이 아직 택시를 타지 않았습니다.");
        } else {
            System.out.println(name + "학생의 남은 돈은 " + money
                    + "원입니다.");
        }
    }
}
