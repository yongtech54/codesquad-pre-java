/*
* 1. 중간 숫자 구하기 (Scanner연습)
* 정수 3개 입력받고 중간에 배치된 수 출력하는 프로그램
*
* solution
* 입력받은 수를 배열에 저장
* 배열의 각 요소에 대해 크기 비교
* */

package day02;

import java.util.*;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];
        int temp;

        System.out.printf("정수 3개 입력 >> ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        System.out.println("중간 값은 " + numbers[1]);
    }
}
