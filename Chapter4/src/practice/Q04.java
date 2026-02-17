package practice;

/**
 * 반복문을 사용하여 별로 삼각형 모양을 출력하는 프로그램
 */
public class Q04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i += 2) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
