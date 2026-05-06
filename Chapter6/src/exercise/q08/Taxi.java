package exercise.q08;

public class Taxi {
    private String name;
    private int money;
    private int passengerCount;

    public Taxi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void takePassenger(int money) {
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println(name + "택시의 승객은 " + passengerCount + "명이고, 수입은 " +
                money + "원입니다.");
    }
}
