/*
* BOJ 10994 - 별찍기 19
* ()밖은 별 갯수, 안은 공백 갯수
*
* 1 => 1
* 2 => 5
* 3 => 9
* 4 => 13
* -----------> 일반항: 4(n-1) + 1
*
* */
package day03.stars;

import java.util.*;

public class Stars19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j;
        int total = 4 * (n - 1) + 1;

        // 상단
        for(i = 0; i < total / 2 + 1; i++) {
            // 홀수번째 라인인 경우
            if (i % 2 == 1) {
                for (j = 0; j < total; j++) {
                    if ((j < i || j > total - 1 - i) && (j % 2 == 0)) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
            // 짝수인 경우
            else {
                for (j = 0; j < total; j++) {
                    if (j >= i && j <= total - 1 - i) {
                        System.out.printf("*");
                    } else if ((j < i || j > total - 1 - i) && (j % 2 == 0)) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
        }
        // 하단
        for (i = total / 2 + 1; i < total; i++) {
            // 홀수
            if (i % 2 == 0) {
                for (j = 0; j < total; j++) {
                    if (j >= total - i - 1 && j <= i) {
                        System.out.printf("*");
                    } else if (j % 2 == 0) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
            // 짝수
            else {
                for (j = 0; j < total; j++) {
                    if (j % 2 == 0 && (j < total - i || j >= i)) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
