package day03.ps;

import java.util.*;

public class Boj2920 {
    public static void main(String[] args) {
        int[] origin = new int[8];

        Scanner sc = new Scanner(System.in);
        int i, j, temp;

        for (i = 0; i < origin.length; i++) {
            origin[i] = sc.nextInt();
        }
        // 배열 복사
        int[] ascArray = origin.clone();
        int[] descArray = origin.clone();
        int[] mixedArray = origin.clone();

        // 오름차순
        for (i = 0; i < ascArray.length - 1; i++) {
            for (j = i; j < ascArray.length - 1; j++) {
                if (ascArray[j] > ascArray[j + 1]) {
                    temp = ascArray[j + 1];
                    ascArray[j + 1] = ascArray[j];
                    ascArray [j] = temp;
                }
            }
        }

        // 내림차순
        for (i = 0; i < descArray.length - 1; i++) {
            for (j = i; j < descArray.length - 1; j++) {
                if (descArray[j] < descArray[j + 1]) {
                    temp = descArray[j + 1];
                    descArray[j + 1] = descArray[j];
                    descArray [j] = temp;
                }
            }
        }

        if (Arrays.equals(origin, ascArray)) {
            System.out.println("ascending");
        } else if (Arrays.equals(origin, descArray)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
