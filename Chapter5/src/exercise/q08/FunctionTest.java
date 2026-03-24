package exercise.q08;

/**
 * Q08.
 * Fuctiontest.java 코드에 사칙 연산을 수행하는 메서드를 모두 구현하고 결괏값을 출력해 봅시다.
 */
public class FunctionTest {

    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        System.out.println(a + "와 " + b + "의 덧셈결과: " + add(a, b));
        System.out.println(a + "와 " + b + "의 뺄셈결과: " + subtract(a, b));
        System.out.println(a + "와 " + b + "의 곱셈결과: " + multiply(a, b));
        System.out.println(a + "와 " + b + "의 나눗셈결과: " + divide(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
