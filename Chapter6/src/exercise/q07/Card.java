package exercise.q07;

public class Card {
    private int cardNumber;
    private String cardName;

    public Card(int cardNumber, String cardName) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    public void showInfo() {
        System.out.println("고객님의 " + cardName + " 카드가 발급되었습니다. 카드 번호는 "
                + cardNumber + "입니다.");
    }
}
