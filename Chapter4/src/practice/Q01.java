package practice;

/**
 * 사칙연산 프로그램 (if-else if문, switch-case문 사용)
 */

public class Q01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '%';
        int result = 0;

        // if-else if문
        if (operator == '+') {
            result = num1 + num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        } else if (operator == '/') {
            result = num1 / num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        } else {
            System.out.println(operator + "는 사칙연산 연산자가 아닙니다.");
        }

        // switch-case문
        switch (operator) {
            case '+':
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '-':
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '*':
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case '/':
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            default:
                System.out.println(operator + "는 사칙연산 연산자가 아닙니다.");
        }
    }
}
