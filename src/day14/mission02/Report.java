package day14.mission02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Report {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/day14/mission02/info.txt"));
        String line = null;
        String[][] studentInfo = new String[5][6];
        List<String> list = new ArrayList<>();

        while((line = br.readLine()) != null) {
            list.add(line);
        }

        System.out.printf("=================[%s]=================\n", "국어 점수 현황");
        System.out.println("[이름]\t\t[학번]\t\t[중점과목]\t\t[점수]");
        for (int i = 0; i < list.size(); i++) {
            String[] temp = list.get(i).split(" ");
            String name = temp[0];
            String id = temp[1];
            String major = temp[2];
            String subject = temp[3];
            int kor = Integer.parseInt(temp[4]);
            int math = Integer.parseInt(temp[5]);
            String grade = null;

            if (major.equals("국어국문학과")) {
                MajorEvaluation me = new MajorEvaluation();
                grade = me.getGrade(kor);
            } else {
                BasicEvaluation be = new BasicEvaluation();
                grade = be.getGrade(kor);
            }
            System.out.printf("%s\t\t%s\t\t\t%s\t\t\t%d : %s\n", name, id, subject, kor, grade);
        }

        System.out.printf("=================[%s]=================\n", "수학 점수 현황");

        for (int i = 0; i < list.size(); i++) {
            String[] temp = list.get(i).split(" ");
            String name = temp[0];
            String id = temp[1];
            String major = temp[2];
            String subject = temp[3];
            int kor = Integer.parseInt(temp[4]);
            int math = Integer.parseInt(temp[5]);
            String grade = null;

            if (major.equals("컴퓨터공학과")) {
                MajorEvaluation me = new MajorEvaluation();
                grade = me.getGrade(math);
            } else {
                BasicEvaluation be = new BasicEvaluation();
                grade = be.getGrade(math);
            }
            System.out.printf("%s\t\t%s\t\t\t%s\t\t\t%d : %s\n", name, id, subject, kor, grade);
        }
    }
}
