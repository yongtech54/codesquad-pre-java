package day04.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Numbers number1 = new Numbers();

        Calculator.readyToCalculate(number1);
        Calculator.printResults();

        Numbers number2 = new Numbers(15, 5);

        Calculator.readyToCalculate(number2);
        Calculator.printResults();
    }
}
