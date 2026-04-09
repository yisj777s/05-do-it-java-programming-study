package cooperation;

public class Subway {
    private String lineNumber; // 지하철 노선 번호
    private int passengerCount; // 승객 수
    private int money;

    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(lineNumber + "의 승객은 " + passengerCount +
                "명이고, 수입은 " + money + "입니다.");
    }
}
