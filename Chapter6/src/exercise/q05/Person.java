package exercise.q05;

public class Person {
    private String name;
    private Cafe lastCafe;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyCoffee(Cafe lastCafe, int money) {
        lastCafe.money += money;
        this.money -= money;
    }
    public void showInfo() {
        System.out.println("아침 출근길에 " + name + "씨는 " + lastCafe.money + "원을 내고"
                + lastCafe.name + "에서 " + lastCafe.menu + "를 사 마셨습니다.");
    }
}
