package exercise.q05;

public class Cafe {
    private String name;
    private String menu;
    private int money;
    private int customerCount;

    public Cafe(String name, String menu) {
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public String getMenu() {
        return menu;
    }

    public void sellCoffee(int money) {
        this.money += money;
        customerCount++;
    }

    public void showInfo() {
        System.out.println(this.name + "카페 방문 고객은 " + this.customerCount + "명이고, 매출은 " +
                money + "원 입니다.");
    }
}
