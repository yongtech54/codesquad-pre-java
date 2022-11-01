package day01.stars;

import java.util.Scanner;

public class Stars7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // IO channel이 아니므로 sc.close()는 굳이 X

        int i, j, k;

        // 다이아 상단부
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                System.out.printf(" ");
            }
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        // 다이아 하단부
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.printf(" ");
            }
            for (k = 0; k < 2 * (n - 1 - i) - 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
