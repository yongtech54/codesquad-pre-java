package day05.average;

import java.util.*;

public class GradeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int mathScore = scanner.nextInt();
        int scienceScroe = scanner.nextInt();
        int englishScroe = scanner.nextInt();

        Grade me = new Grade(mathScore, scienceScroe, englishScroe);
        System.out.println("평균은 " + me.scoreAverage());

        scanner.close();
    }
}
