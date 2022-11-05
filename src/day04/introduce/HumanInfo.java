package day04.introduce;

public class HumanInfo {
    String name;
    String gender;
    String isMarried;
    int numberOfChildren;
    int age;

    HumanInfo(String name) {
        this(name, "여성", "기혼자", 1, 30);
    }

    HumanInfo(String name, String gender, String isMarried, int numberOfChildren, int age) {
        this.name = name;
        this.gender = gender;
        this.isMarried = isMarried;
        this.numberOfChildren = numberOfChildren;
        this.age = age;
    }

    void introduce() {
        System.out.println("이름은 " + name + "이고 나이는 " + age + "입니다. "
                            + "성별은 " + gender + "이며, " + isMarried + "입니다. "
                            + "자녀는 " + numberOfChildren + "명 있습니다.");
    }
}
