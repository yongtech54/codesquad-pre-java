package day04.introduce;

public class HumanInfo {
    private String name;
    private String gender = "여성";
    private String isMarried = "기혼자";
    private int numberOfChildren = 1;
    private int age = 30;

    public HumanInfo(String inputName) {
        this.name = inputName;
    }

    void introduce() {
        System.out.println("이름은 " + name + "이고 나이는" + age + "입니다. "
                            + "성별은 " + gender + "이며, " + isMarried + "입니다. "
                            + "자녀는 " + numberOfChildren + "명 있습니다.");
    }
}
