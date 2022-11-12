package day07.schedule;

import java.util.Scanner;

class Day {
    private String work;

    public void saveTodayWork(String work) { this.work = work; };
    public String getTodayWork() { return work; };

    public String hasWork() {
        if (work == null) {
            return "없습니다";
        }
        return work + "입니다.";
    }
}

public class ScheduleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이번달 스케쥴 관리 프로그램");
        int num;
        int date;
        String todos;
        Day[] days = new Day[31];

        while (true) {
            System.out.print("할 일 ([1]입력 [2]조회 [3]종료) >> ");
            num = sc.nextInt();

            if (num == 1) {
                System.out.print("날짜 (1일~30일) >> ");
                date = sc.nextInt();
                System.out.print("할 일 (빈칸없이 입력) >> ");
                sc.nextLine();  // 개행처리
                todos = sc.nextLine();

                days[date] = new Day();
                days[date].saveTodayWork(todos);

            } else if (num == 2) {
                System.out.print("날짜 (1일~30일) >> ");
                date = sc.nextInt();

                System.out.println(days[date].getTodayWork());
            } else {
                break;
            }
        }
    }
}
