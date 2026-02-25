package practice;

/**
 * 1~100중 3의 배수 출력
 */
public class Q15 {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}

