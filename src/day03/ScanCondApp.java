/*
* 5. Scanner, switch, 분기문 익히기
* 사칙연산을 입력받아 계산하는 프로그램
* 피연산자는 모두 실수로 변환
*
* */

package day03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScanCondApp {
    public static double ifCal(double num1, String op, double num2) {
        if (op.equals("+")) {
            return num1 + num2;
        } else if (op.equals("-")) {
            return num1 - num2;
        } else if (op.equals("*")) {
            return num1 * num2;
        } else {
            return num1 / num2;
        }
    }

    public static double switchCal(double num1, String op, double num2) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            default:
                return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====사칙연산 계산기 프로그램을 실행합니다=====");
            System.out.println("프로그램의 연산방법을 선택하세요!");
            System.out.println("0. 종료");
            System.out.println("1. if-else문 함수 사용");
            System.out.println("2. switch문 함수 사용");

            int choice = sc.nextInt();
            double num1, num2, ans;
            String op;

            if (choice == 1) {
                System.out.printf("식을 입력해주세요 (usage: 3 + 2) >> " );
                num1 = (double)sc.nextInt();
                op = sc.next();
                num2 = (double)sc.nextInt();

                ans = ifCal(num1, op, num2);

                System.out.println(num1 + " " + op + " " + num2 + " = " + ans);

            } else if (choice == 2) {
                System.out.printf("식을 입력해주세요 (usage: 3 + 2) >> " );
                num1 = (double)sc.nextInt();
                op = sc.next();
                num2 = (double)sc.nextInt();

                ans = switchCal(num1, op, num2);
                System.out.println(num1 + " " + op + " " + num2 + " = " + ans);

            } else if (choice == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("잘못된 선택입니다, 다시 입력해주세요.");
            }
        }
    }
}

