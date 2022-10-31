package day01;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println("1단부터 9단까지 출력합니다!");

        for (int i = 1; i < 10; i++) {
            System.out.println("==========" + i + "단==========");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
        System.out.println("구구단 프로그램을 종료합니다!");
    }
}
