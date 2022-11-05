package day04.cafe;

public class CafeTest {
    public static void main(String[] args) {
        Baristar baristarAtStar = new Baristar("별다방");
        Baristar baristarAtKong = new Baristar("콩다방");

        Customer james = new Customer("James", 5000);
        Customer tomas = new Customer("Tomas", 10000);

        james.order(baristarAtStar, "아메리카노");
        tomas.order(baristarAtKong, "라떼");
    }
}
