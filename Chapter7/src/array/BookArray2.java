package array;

public class BookArray2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("Do it! 점프 투 파이썬", "박응용");
        library[1] = new Book("Do it! LLM을 활용한 AI 에이전트 개발 입문", "이성용");
        library[2] = new Book("Do it! 오토캐드 2026", "박한울");
        library[3] = new Book("Do it! 시뮬레이터+키트로 완성하는 아두이노 입문", "박필준");
        library[4] = new Book("Do it! HTML+CSS+자바스크립트 웹 표준의 정석", "고경희");

        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
}
