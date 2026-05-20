package array;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("Do it! 점프 투 파이썬", "박응용");
        bookArray1[1] = new Book("Do it! LLM을 활용한 AI 에이전트 개발 입문", "이성용");
        bookArray1[2] = new Book("Do it! 오토캐드 2026", "박한울");
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("Do it! C++ 완전 정복");
        bookArray1[0].setAuthor("조규남");

        System.out.println("=== bookArray1 ===");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("=== bookArray2 ===");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
    }
}
