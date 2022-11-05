package day04.introduce;

public class HumanInfo {
    String name;
    String gender = "여성";
    String isMarried = "기혼자";
    int numberOfChildren = 1;
    int age = 30;

    HumanInfo(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다. "
                            + "성별은 " + gender + "이며, " + isMarried + "입니다. "
                            + "자녀는 " + numberOfChildren + "명 있습니다.");
    }
}
