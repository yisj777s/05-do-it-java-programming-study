package loopexample;

/**
 * do-while문으로 1부터 10까지 더하기
 */
public class DoWhileExample {
    public static void main(String[] agrs) {
        int num = 1;
        int sum = 0;

        // 조건식이 참이 아니더라도 무조건 한 번 수행함
        do {
            sum += num;
            num++;
        } while (num <= 10);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
