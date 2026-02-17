package practice;

/**
 * 구구단에서 각 단마다 곱하는 수가 해당 단보다 작거나 같은 경우까지만 출력하는 프로그램 (break문 사용)
 */
public class Q03 {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) {
            for (int times = 1; times <= 9; times++) {
                if (times <= dan) {
                    System.out.println(dan + " * " + times + " = " + dan * times);
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }
}
