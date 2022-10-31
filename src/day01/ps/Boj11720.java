/*
* String -> Array
* Array -> 각 element 접근
*/

package day01.ps;

import java.util.Scanner;

public class Boj11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();  // enter 처리
        String numbersString = sc.nextLine();

        sc.close();

        String[] numbersArray = numbersString.split("");
        int[] numbers = new int[numbersArray.length];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
            ans += numbers[i];
        }

        System.out.println(ans);
    }
}
