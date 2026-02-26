package practice;
import java.util.Scanner;

/**
 * n을 입력받아 1부터 n까지 수 중 소수 출력
 */
public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int n = scanner.nextInt();
        int count;
        String pN = "";

        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                pN += i + " ";
            }
        }

        System.out.println("1부터 " + n + "사이의 소수는 " + pN + "입니다." );
    }
}
