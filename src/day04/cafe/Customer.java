package day04.cafe;

public class Customer {
    String name;
    int money;

    Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    void order(Baristar baristarAtCafe, String menu) {
        baristarAtCafe.getOrder(this, menu);
    }
}
