package day01.stars;

import java.util.Scanner;

public class Stars16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                System.out.printf(" ");
            }
            for (k = 0; k < 2 * i + 1; k++) {
                if (k % 2 == 0) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
