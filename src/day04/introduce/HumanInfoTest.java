package day04.introduce;

public class HumanInfoTest {
    public static void main(String[] args) {
        HumanInfo jane = new HumanInfo("Jane");
        jane.introduce();

        HumanInfo paul = new HumanInfo("Paul", "남자", "미혼자", 0, 29);
        paul.introduce();
    }
}
