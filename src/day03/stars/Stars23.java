/*
* 중간라인 신경 쓸 것
*
* */
package day03.stars;

import java.util.Scanner;

public class Stars23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j;
        int total = 4 * (n - 1) + 1;
        int midLine = n - 1;

        for (i = 0; i < 2 * n - 1; i++) {
            // case: 첫번째, 마지막 라인
            if (i == 0 || i == 2 * n - 2) {
                for (j = 0; j < total; j++) {
                    if (j < n || j > total - 1 - n) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
            // case: 중간라인이하
            else if (i <= midLine) {
                for (j = 0; j < total; j++) {
                    if ((j == i) || (j == i + (n - 1)) || (j == total - 1 - i) || (j == total - i - n)) {
                        System.out.printf("*");
                    } else if (j < total - 1 - i) {
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
            // case: 중간라인 초과
            else {
                for (j = 0; j < total; j++) {
                    if (j == midLine + i || j == midLine + i + (n - 1) || j == (2 * n - 2) - i || j == (2 * n - 2) - i + (n - 1)) {
                        System.out.printf("*");
                    } else if (j < midLine + i + (n - 1)){
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
