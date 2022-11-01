/*
* 2. 369 게임!
*
* 3, 6, 9가 등장하는 횟수에 따른 박수의 횟수 출력 프로그램
* quit을 입력하는 경우 프로그램 종료
*
* solution
* 입력받은 문자열과 quit의 비교
* 문자열을 배열로 변환하여 각 요소에 접근하여 정수로 변환
* 변환된 정수에 따른 값 비교를 통해 조건에 따른 카운팅 진행
* */

package day02;

import java.util.*;

public class GameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("1~99 사이의 정수를 입력하시오 (종료: quit) >> ");

            String n = sc.nextLine();

            if (n.equals("quit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            int cnt = 0;
            int i;

            String[] numbers = n.split("");

            for (i = 0; i < numbers.length; i++) {
                int targetN = Integer.parseInt(numbers[i]);
                if (targetN == 3 || targetN == 6 || targetN == 9) {
                    cnt++;
                }
            }
            String clap = "박수";

            for (i = 0; i < cnt; i++) {
                clap += "짝";
            }

            if (cnt == 0) {
                clap = "박수 칠 때가 아니에요...";
            }

            System.out.println(clap);
        }
    }
}
