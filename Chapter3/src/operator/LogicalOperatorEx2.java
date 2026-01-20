package operator;

public class LogicalOperatorEx2 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 논리 곱에서 앞 항의 결괏값이 거짓이므로 (i = i + 2) < 10 부분은 실행되지 않음
        System.out.println(value); // false
        System.out.println(num1);  // 20
        System.out.println(i);     // 2 - 논리 곱에서 앞 항이 거짓이면 뒤 항이 실행되지 않아 i값이 그대로

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // 논리 합에서 앞 항의 결괏값이 참이므로 (i = i + 2) < 10 부분은 실행되지 않음
        System.out.println(value); // ture
        System.out.println(num1);  // 30
        System.out.println(i);     // 2 - 논리 합에서 앞 항이 참이면 뒤 항이 실행되지 않아 i값이 그대로
    }
}
