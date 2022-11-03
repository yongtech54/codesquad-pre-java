/*
* Mission #2 - 2.
*
* 같은 패키지 내 HumanInfo class를 사용
* 인스턴스 변수와 클래스 변수의 차이를 이해하기 위해 추가적인 실습 진행
* 함께 static 정의에 따른 같은 클래스 내 메서드의 변수 접근 여부 확인
* */
package day04;

public class HumanInfoTest {
    public static void main(String[] args) {
        HumanInfo jane = new HumanInfo("Jane");
        HumanInfo john = new HumanInfo("John");

        jane.introduce();
        john.introduce();

        john.gender = "남성";
        john.isMarried = "미혼자";
        john.numberOfChildren = 0;
        HumanInfo.isHuman = "멋진 사람";

        john.introduce();
        jane.introduce();
    }
}
