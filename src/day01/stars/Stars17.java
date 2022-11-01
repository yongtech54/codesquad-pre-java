package day01.stars;

import java.util.Scanner;

public class Stars17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j;
        int mid = n - 1;

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < 2 * n - 1; j++) {
                if (j == mid - i || j == mid + i) {
                    System.out.printf("*");
                } else if (j < mid + i) {
                    System.out.printf(" ");
                }
            }
                System.out.println();
            }
        for (i = 0; i < 2 * n - 1; i++) {
            System.out.printf("*");
        }
    }
}