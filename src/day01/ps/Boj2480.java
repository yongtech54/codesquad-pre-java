package day01.ps;

import java.util.Scanner;

public class Boj2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        sc.close();

        int money;

        if (dice1 == dice2 && dice2 == dice3) {
            money = 10000 + (dice1 * 1000);
        } else if (dice1 == dice2 || dice2 == dice3) {
            money = 1000 + (dice2 * 100);
        } else if (dice1 == dice3) {
            money = 1000 + (dice1 * 100);
        } else {
            int diceMax = (dice1 > dice2) ? dice1 : dice2;
            diceMax = (diceMax > dice3) ? diceMax : dice3;
            money = (diceMax * 100);
        }

        System.out.println(money);
    }
}
