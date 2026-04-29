package exercise.q06;

public class Card {
    private static int serialNum = 1000;
    private int cardNum;

    public Card() {
        serialNum++;
        this.cardNum = serialNum;
    }

    public void showInfo() {
        System.out.println("고객님의 카드가 발급되었습니다. 카드 번호는 " + cardNum + "입니다.");
    }
}
