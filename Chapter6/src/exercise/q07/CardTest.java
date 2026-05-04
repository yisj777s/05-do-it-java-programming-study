    package exercise.q07;

    public class CardTest {
        public static void main(String[] args) {
            CardCompany cardCompany = CardCompany.getInstance();

            Card card1 = cardCompany.createCard("shopping card");
            Card card2 = cardCompany.createCard("bus card");
            Card card3 = cardCompany.createCard("library card");

            card1.showInfo();
            card2.showInfo();
            card3.showInfo();
        }
    }
