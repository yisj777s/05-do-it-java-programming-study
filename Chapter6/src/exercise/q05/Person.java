package exercise.q05;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyCoffee(Cafe cafe, int money) {
        cafe.sellCoffee(money);
        this.money -= money;
    }

    public void showInfo() {
        System.out.println("아침 출근길에 " + name + "씨는 " + Cafe.getMoney() + "원을 내고"
                + Cafe.getName() + "에서 " + Cafe.getMenu() + "를 사 마셨습니다.");
    }
}
