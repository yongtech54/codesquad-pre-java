package day01.ps;

import java.util.Scanner;

public class Boj2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        sc.close();

        int totalTime = (hour * 60) + min + time;
        hour = totalTime / 60 % 24;
        min = totalTime % 60;

        System.out.println(hour + " " + min);
    }
}
