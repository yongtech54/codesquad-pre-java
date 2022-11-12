package day10.grade;

import java.io.*;
import java.util.*;

public class GradeApp {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\techt\\codesquad-pre-java\\src\\day10\\grade\\input.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> list = new ArrayList<>();
        String info = null;

        while ((info = br.readLine()) != null) {
            list.add(info);
        }

        for (int i = 0; i < list.size(); i++) {
            String[] temp = list.get(i).split(" ");
            String name = temp[0];

            int total = 0;
            int subject = 0;

            for (int j = 3; j < temp.length; j++) {
                total += Integer.parseInt(temp[j]);
                subject++;
            }

            String result = String.format("%s 학생은 %d과목을 수강했습니다.\n" +
                                            "총점은 %d점이고 평균은 %d점 입니다.", name, subject, total, (total / subject));

            System.out.println(result);
        }

        br.close();
    }
}
