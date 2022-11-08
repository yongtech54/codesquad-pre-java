package day07.lastword;

import java.util.Scanner;

public class LastWordApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 시작합니다!");

        System.out.print("게임에 참여하는 인원은 몇 명입니까? >> ");
        int n = sc.nextInt();
        String[] users = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("참가자의 이름을 입력해주세요 >> ");
            users[i] = sc.next();
        }

        System.out.println("시작 단어는 \"기러기\"입니다.");

        int i = 0;
        String word;
        char startWord = '기';

        while (true) {
            System.out.print(users[i] + " >> ");
            word = sc.next();

            // 끝말잇기
            if (startWord != word.charAt(0)) break;

            startWord = word.charAt(word.length() - 1);

            i++;
            if (i == n) i = 0;
        }

        System.out.println(users[i] + "님이 졌습니다.");
        sc.close();
    }
}
