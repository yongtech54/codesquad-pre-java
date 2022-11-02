/*
 * 3. if 논리 연습하기
 * 2차원 좌표 평면에서 (100, 100), (200, 200)의 두 점으로 이루어진 사각형
 * 좌표를 입력받아 해당 좌표가 사각형 안에 있는지 판별하는 프로그램
 *
 * solution
 * 사각형의 범위를 정의하여 입력 받은 두 값 모두 참 => 안에 있음
 * 하나라도 이탈하는 경우 => 밖에 있음
 * */

package day03;

import java.util.*;

public class IfLogicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("점 (x, y)의 좌표를 입력하시오. 단, 공백으로 구분합니다 (\"quit\"을 입력하면 종료) >> ");

            String inputX = sc.next();

            if (inputX.equals("quit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String inputY = sc.next();

            if (inputY.equals("quit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int x = Integer.parseInt(inputX);
            int y = Integer.parseInt(inputY);

            System.out.println("입력값 >> " + x + " " + y);
            /*
             * 중첩 조건문이 좋은 코드일까?
             * 조건식을 늘려서라도 중첩을 줄이는게 좋은 코드일까?
             * */
            if (x >= 100 && x <= 200) {
                if (y >= 100 && y <= 200) {
                    System.out.printf("(%d, %d)는 안에 있습니다\n", x, y);
                } else {
                    System.out.printf("(%d, %d)는 밖에 있습니다\n", x, y);
                }
            } else {
                System.out.printf("(%d, %d)는 밖에 있습니다\n", x, y);
            }
            System.out.println("Try again!");
        }
    }
}
