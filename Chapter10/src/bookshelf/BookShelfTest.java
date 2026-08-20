package bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("자바 1");
        shelfQueue.enQueue("자바 2");
        shelfQueue.enQueue("자바 3");

        System.out.println(shelfQueue.getSize());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
