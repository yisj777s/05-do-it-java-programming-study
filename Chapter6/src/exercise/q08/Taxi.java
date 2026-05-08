package exercise.q08;

public class Taxi {
    private String name;
    private int fare;
    private int income;
    private int passengerCount;

    public Taxi(String name, int fare) {
        this.name = name;
        this.fare = fare;
    }

    public String getName() {
        return name;
    }

    public int getFare() {
        return fare;
    }

    public int takePassenger() {
        passengerCount++;
        income += fare;
        return fare;
    }

    public void showInfo() {
        if (passengerCount == 0) {
            System.out.println("아직 " + name + "택시의 승객이 없습니다.");
        } else {
            System.out.println(name + "택시의 승객은 " + passengerCount + "명이고, 수입은 " +
                    income + "원입니다.");
        }
    }
}
