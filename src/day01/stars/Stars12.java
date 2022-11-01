package day01.stars;

import java.util.Scanner;

public class Stars12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                System.out.printf(" ");
            }
            for (k = 0; k < i + 1; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.printf(" ");
            }
            for (k = 0; k < n - 1 - i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
