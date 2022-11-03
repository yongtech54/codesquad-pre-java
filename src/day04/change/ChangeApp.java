/*
 * Mission #2 - 3.
 * 잔돈 알림
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
package day04.change;

public class ChangeApp {
    public static void main(String[] args) {
        String[] customerOrder;
        Customer james = new Customer("James", 5000);
        Customer tomas = new Customer("Tomas", 10000);

        customerOrder = james.order("별 다방", "아이스 아메리카노");
        Cafe.getOrder(james, customerOrder);
        Cafe.toCustomer();

        customerOrder = tomas.order("콩 다방", "라떼");
        Cafe.getOrder(tomas, customerOrder);
        Cafe.toCustomer();
    }
}
