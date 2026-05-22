package array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("Do it! 점프 투 파이썬", "박응용"));
        library.add(new Book("Do it! LLM을 활용한 AI 에이전트 개발 입문", "이성용"));
        library.add(new Book("Do it! 오토캐드 2026", "박한울"));
        library.add(new Book("Do it! C++ 완전 정복", "조규남"));
        library.add(new Book("Do it! C언어 입문", " 김성엽"));

        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            book.showBookInfo();
        }
        System.out.println();

        System.out.println("=== 향상된 for문 사용 ===");
        for (Book book : library) {
            book.showBookInfo();
        }

    }
}
