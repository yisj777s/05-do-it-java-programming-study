package practice;

/**
 * 1씩 더하다가 합이 500이 넘는 순간의 값 구하기
 */
public class Q16 {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        for (num = 1; ; num++) {
            sum += num;
            if (sum > 500)
                break;
        }
        System.out.println("sum : " + sum);
        System.out.println("num : " + num);
    }
}
