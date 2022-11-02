/*
* 4. 조건문과 함수 연습
* 두 점을 입력받아 (100, 100), (200, 200) 으로 이루어진 사각형과
* 충돌하는지 판단하는 프로그램
*
* 함수로 작성할 것
* */

package day03;

import java.util.Scanner;

public class ifFuncApp {
    public static int rectX1 = 100;
    public static int rectY1 = 100;
    public static int rectX2 = 200;
    public static int rectY2 = 200;

    public static boolean isCrash(int x1, int y1, int x2, int y2) {
        if (((x1 >= rectX1 && x1 <= rectX2) && (y1 >= rectY1 && y1 <= rectY2))
        || ((x2 >= rectX1 && x2 <= rectX2) && (y2 >= rectY1 && y2 <= rectY2))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("첫번째 (x, y) 좌표를 입력하세요 >> ");

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.printf("두번째 (x, y) 좌표를 입력하세요 >> ");

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (isCrash(x1, y1, x2, y2)) {
            System.out.println("충돌하는 사각형입니다!");
        } else {
            System.out.println("충돌하지 않네요~");
        }
    }
}
