/*
 * Mission #2 - 2.
 * 사람에 대한 정보를 클래스로 작성
 * 사람이 있다
 * 이름은 제인, 나이는 30세
 * 여성, 기혼, 자녀 1명
 * 인스턴스를 생성할 때 이름은 생성자의 매개변수로 받는다
 *
 * access modifier 고민
 * 코딩컨벤션 준수
 * 객체지향 생활체조 준수
 * 1. 한 메서드에는 두 단계 이내의 들여쓰기
 * 2. else 지양
 * 5. 축약 금지
 * 메소드 크기는 20줄 이내
 * 한 메소드는 한 가지 기능 담당
 * */
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
