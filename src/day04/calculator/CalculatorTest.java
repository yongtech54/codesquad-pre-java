package day04.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Numbers number = new Numbers();

        Calculator.readyToCalculate(number);
        Calculator.printResults();
    }
}
