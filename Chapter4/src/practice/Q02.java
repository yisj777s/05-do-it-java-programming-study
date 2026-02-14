package practice;

/**
 * 구구단에서 짝수 단만 출력하는 프로그램
 */
public class Q02 {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) {
            if (dan % 2 != 0) {
                continue;
            }
            for (int times = 1; times <= 9; times++) {
                System.out.println(dan + " * " + times + " = " + dan * times);
            }
            System.out.println();
        }
    }
}
