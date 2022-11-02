package day03.ps;

import java.util.Scanner;

public class Boj8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] record;
        int i, j;
        int point = 0;
        int addPoint;

        for (i = 0; i < n; i++) {
            record = sc.next().split("");
            addPoint = 0;
            point = 0;

            for (j = 0; j < record.length; j++) {
                if (record[j].equals("O")) {
                    point++;
                } else {
                    point = 0;
                }
                addPoint += point;
            }
            System.out.println(addPoint);
        }
    }
}
