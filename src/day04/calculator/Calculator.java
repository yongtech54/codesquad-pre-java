package day04.calculator;

public class Calculator {
    static Numbers numbers;
    static String[] operators = {"덧셈", "뺄셈", "곱셈", "나눗셈"};
    static int[] results = new int[4];

    static void readyToCalculate(Numbers inputNumber) {
        numbers = inputNumber;
    }

    static int addNumbers() {
        return numbers.num1 + numbers.num2;
    }

    static int subtractNumbers() {
        return numbers.num1 - numbers.num2;
    }

    static int multiplyNumbers() {
        return numbers.num1 * numbers.num2;
    }

    static int divideNumbers() {
        return numbers.num1 / numbers.num2;
    }

    static void runCalculator() {
        results[0] = addNumbers();
        results[1] = subtractNumbers();
        results[2] = multiplyNumbers();
        results[3] = divideNumbers();
    }

    static void printResults() {
        runCalculator();
        
        System.out.println("============" + "사칙연산 결과" + "============");
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(numbers.num1 + "과(와) " + numbers.num2 + "의 " + operators[i] + " 결과는 " + results[i] + "입니다.");
        }

        System.out.println("===================================");
    }
}
