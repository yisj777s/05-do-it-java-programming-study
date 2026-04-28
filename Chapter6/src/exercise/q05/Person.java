package exercise.q05;

public class Person {
    private String name;
    private String lastCafe;
    private String lastMenu;
    private int lastPayment;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyCoffee(Cafe cafe, int money) {
        cafe.sellCoffee(money);
        this.lastCafe = cafe.getName();
        this.lastMenu = cafe.getMenu();
        this.lastPayment = money;
        this.money -= money;
    }

    public void showInfo() {
        System.out.println("최근 구매: " + name + "씨는 " + lastPayment + "원을 내고 "
                + lastCafe + "에서 " + lastMenu + "를 사 마셨습니다." +
                 " 남은돈: " + money +"원.");
    }
}
