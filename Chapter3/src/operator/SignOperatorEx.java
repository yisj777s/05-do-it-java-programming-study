package operator;

public class SignOperatorEx {
    public static void main(String[] args) {
        int num = 10;

        System.out.println(+num); // 값 10이 그대로 출력됨
        System.out.println(-num); // 값 10에 -가 붙어서 -10이 출력되지만 num값이 실제로 바뀌지는 않음
        System.out.println(num);  // 값 10이 그대로 출력됨

        num = -num;               // num값을 음수로 바꿔서 다시 num에 대입함
        System.out.println(num);  // 값 -10이 출력됨
    }
}
