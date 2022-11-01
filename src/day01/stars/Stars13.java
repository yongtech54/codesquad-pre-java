package day01.stars;

import java.util.Scanner;

public class Stars13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = i; j < n - 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
