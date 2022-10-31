package day01.stars;

import java.util.Scanner;

public class Stars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
