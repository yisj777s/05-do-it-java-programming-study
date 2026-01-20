package operator;

public class LogicalOperatorEx1 {
    public static void main (String[] args) {
        int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag); // true

        flag = (num1 < 0) && (num2 > 0);
        System.out.println(flag); // false

        flag = (num1 < 0) || (num2 > 0);
        System.out.println(flag); // true
    }
}
