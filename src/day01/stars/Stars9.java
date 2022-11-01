package day01.stars;

import java.util.Scanner;

public class Stars9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (k = 0; k < 2 * (n - 1 - i) + 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 2 - i; j++) {
                System.out.printf(" ");
            }
            for (k = 0; k < 2 * (i + 1) + 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
