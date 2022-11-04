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
        System.out.println("이름은 " + this.name + "이고 나이는" + this.age + "입니다. "
                            + "성별은 " + this.gender + "이며, " + this.isMarried + "입니다. "
                            + "자녀는 " + this.numberOfChildren + "명 있습니다.");
    }
}