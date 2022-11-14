/**
 * [문제 1] 멤버십 관리하는 프로그램
 * 매출 충성도에 따라 등급 부여 (RED / PLATINUM / DIAMOND)
 * RED:      할인율 x,     1 % 포인트 적립, 주차요금 시간당 3000원
 * PLATINUM: 5 % 할인율,   5 % 포인트 적립, 주차요금 시간당 1000원
 * DIAMOND:  10 % 할인율,  10% 포인트 적립, 주차요금 시간당 무료,    전문 상담원 배정
 *
 */
package day11.mission01;

import java.util.ArrayList;

public class MembershipApp {
    public static void main(String[] args) {
        Red james = new Red("James", "RED", 10000, 2);
        Red tomas = new Red("Tomas", "RED", 30000, 2);
        Platinum edward = new Platinum("Edward", "PLATINUM", 10000, 2);
        Platinum percy = new Platinum("Percy", "PLATINUM", 30000, 2);
        Diamond elizabet = new Diamond("Elizabet", "DIAMOND", 30000, 2);

        ArrayList<Membership> memberList = new ArrayList<>();
        memberList.add(james);
        memberList.add(tomas);
        memberList.add(edward);
        memberList.add(percy);
        memberList.add(elizabet);

        for (int i = 0; i < memberList.size(); i++) {
            memberList.get(i).showInfo();
        }

    }
}
