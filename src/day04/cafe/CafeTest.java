package day04.cafe;

public class CafeTest {
    public static void main(String[] args) {
        Customer james = new Customer("James", 5000);
        Customer tomas = new Customer("Tomas", 10000);

        Baristar baristarAtStar = new Baristar("별다방");
        baristarAtStar.getOrder(james, "아메리카노");

        Baristar baristarAtKong = new Baristar("콩다방");
        baristarAtKong.getOrder(tomas, "라떼");

    }
}
