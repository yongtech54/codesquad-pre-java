package day01.stars;

import java.util.Scanner;

public class Stars8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < 2 * n; j++) {
                if (j < i + 1 || j > 2 * n - i - 2) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < 2 * n; j++) {
                /*
                * 4 ~ 5 공백
                * 3 ~ 6 공백
                * 2 ~ 7 공백
                * 1 ~ 8 공백
                * */
                if (j < (2 * n) / 2 - 1 - i || j > (2 * n) / 2 + i) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
