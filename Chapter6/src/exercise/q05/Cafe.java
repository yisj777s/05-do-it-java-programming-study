package exercise.q05;

public class Cafe {
    private String name;
    private int money;
    private int customerCount;

    public void sellCoffee(int money) {
        this.money += money;
        customerCount++;
    }

    public void showInfo() {
        System.out.println(this.name + "카페 방문 고객은 " + this.customerCount + "명이고, 매출은 " +
                money + "원 입니다.");
    }
}
