package day01.stars;

import java.util.Scanner;
/*
* n개로 이루어진 패턴 n번 출력
* */
public class Stars21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i, j;

        // loop 1: 패턴의 반복 횟수
        for (i = 0; i < n; i++) {
            // loop 2: 패턴
            for (j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }

            System.out.println();

            for (j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("*");
                }
            }

            System.out.println();
        }
    }
}
