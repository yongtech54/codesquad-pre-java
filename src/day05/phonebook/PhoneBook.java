package day05.phonebook;

import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원수를 입력하세요 >> ");
        int n = scanner.nextInt();

        Phone[] phones = new Phone[n];
        String name;
        String tel;

        for (int i = 0; i < n; i++) {
            System.out.print("이름과 전화번호를 입력하세요 >> ");
            name = scanner.next();
            tel = scanner.next();
            phones[i] = new Phone(name, tel);
            System.out.println("[Message] " + (i + 1) + "/" + n + " 등록완료");
        }

        System.out.println("입력하신 내용이 모두 등록되었습니다");

        System.out.println("==========전화번호부 검색==========");

        while (true) {
            System.out.print("검색할 이름을 입력해주세요 (* q를 누르면 종료합니다)>> ");
            name = scanner.next();
            Boolean checked = false;
            if (name.equals("q")) break;

            for (int i = 0; i < n; i++) {
                if (phones[i].name.contains(name)) {
                    System.out.println(phones[i].name + "님의 번호는 " + phones[i].tel + "입니다.");
                    checked = true;
                    break;
                }
            }

            if (!checked) System.out.println(name + "님은 등록되지 않은 정보입니다.");
        }

        scanner.close();
    }
}
