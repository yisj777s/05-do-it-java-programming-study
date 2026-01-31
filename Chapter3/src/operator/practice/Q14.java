package operator.practice;

public class Q14 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = ~num1;

        System.out.println("원래 값: " + num1);
        System.out.println("비트를 반대로 뒤집은 값: " + num2);
        System.out.println("이진수로 표현한 원래 값: " + Integer.toBinaryString(num1));
        System.out.println("비트를 반대로 뒤집은 값: " + Integer.toBinaryString(num2));
    }
}
