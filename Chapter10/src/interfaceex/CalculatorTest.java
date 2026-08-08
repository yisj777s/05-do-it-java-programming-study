package interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalculator calculator = new CompleteCalculator();
        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.substract(num1, num2));
        System.out.println(calculator.multiply(num1, num2));
        System.out.println(calculator.divide(num1, num2));
        calculator.showInfo();
        calculator.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calculator.total(arr));
    }
}
