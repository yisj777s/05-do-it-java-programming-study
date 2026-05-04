package exercise.q07;

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private static int serialNumber = 1000;

    private CardCompany() {
    }

    public static CardCompany getInstance() {
        return instance;
    }

    public Card createCard(String cardName) {
        int cardNumber = ++serialNumber;
        return new Card(cardNumber, cardName);
    }
}
