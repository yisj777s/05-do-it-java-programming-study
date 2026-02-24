package practice;

/**
 * while문으로 1부터 50까지 합 구하기
 */
public class Q11 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 50) {
            sum += num;
            num++;
        }
        System.out.println("1부터 50까지 합은 " + sum + "입니다.");
    }
}
