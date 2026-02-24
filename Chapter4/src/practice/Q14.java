package practice;

/**
 * 중첩 for문으로 구구단 3단~7단 출력
 */
public class Q14 {
    public static void main(String[] args) {
        for (int dan = 3; dan <= 7; dan++) {
            for (int times = 1; times <= 9; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
}
