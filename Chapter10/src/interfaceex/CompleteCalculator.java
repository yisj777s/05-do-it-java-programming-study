package interfaceex;

public class CompleteCalculator extends CalculatorImpl {
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Calculator.ERROR;
        }
    }

    public void showInfo() {
        System.out.println("Calculator 인터페이스를 구현하였습니다.");
    }
}
