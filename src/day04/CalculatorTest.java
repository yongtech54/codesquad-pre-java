/*
 * Mission #2 - 1.
 * 10과 2를 속성 값으로 가지는 클래스 작성 -> Init
 * 이를 사칙연산하는 클래스 작성 -> Calculator
 * 이를 사용하는 클래스 작성 -> ClassCalculator
 * 최종적으로 사칙연산의 결과 출력
 *
 * access modifier 고민
 * 코딩컨벤션 준수
 * 객체지향 생활체조 준수
 * 1. 한 메서드에는 두 단계 이내의 들여쓰기
 * 2. else 지양
 * 5. 축약 금지
 * 메소드 크기는 20줄 이내
 * 한 메소드는 한 가지 기능 담당
 * */

package day04;

// 10과 2를 속성 값으로 가지는 클래스
class Init {
    public static int num1 = 10;
    public static int num2 = 2;
}

// 이를 사칙연산하는 클래스
class Calculator {
    public static String[] operators = {"덧셈", "뺄셈", "곱셈", "나눗셈"};
    public static int[] results = new int[4];
    public static int addResult;
    public static int subtractResult;
    public static int multiplyResult;
    public static int divideResult;
    private static int num1;
    private static int num2;
    public static int addNum() {
        return num1 + num2;
    }

    public static int subtractNum() {
        return num1 - num2;
    }

    public static int multiplyNum() {
        return num1 * num2;
    }

    public static int divideNum() {
        return num1 / num2;
    }

    public static void readyCalculate(int inputNum1, int inputNum2) {
        num1 = inputNum1;
        num2 = inputNum2;
    }
    public static void getResult() {
        results[0] = addNum();
        results[1] = subtractNum();
        results[2] = multiplyNum();
        results[3] = divideNum();
    }
    public static void printResult() {
        getResult();
        for (int i = 0; i < results.length; i++) {
            System.out.println("두 수의 " + operators[i] + "한 결과는 " + results[i] + "입니다!");
        }
    }
}

// 이를 사용하는 클래스
public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = Init.num1;
        int num2 = Init.num2;

        Calculator.readyCalculate(num1, num2);
        Calculator.printResult();
    }
}
