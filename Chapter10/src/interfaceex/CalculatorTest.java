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
    }
}
