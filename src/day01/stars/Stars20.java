package day01.stars;

import java.util.Scanner;

public class Stars20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j;

        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < 2 * n; j++) {
                    if (j % 2 == 0) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
            } else {
                for (j = 0; j < 2 * n; j++) {
                    if (j % 2 == 0) {
                        System.out.printf(" ");
                    } else {
                        System.out.printf("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
