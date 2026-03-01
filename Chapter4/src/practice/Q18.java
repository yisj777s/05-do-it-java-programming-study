package practice;

import java.util.Scanner;

/**
 * 정수 n을 입력받아 팩토리얼 계산
 */
public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("팩토리얼 계산할 숫자를 입력하세요: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("음수는 팩토리얼 불가");
            return;
        }

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + " 팩토리얼은 " + factorial + "입니다.");
    }
}