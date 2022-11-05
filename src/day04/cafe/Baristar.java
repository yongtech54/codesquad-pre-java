package day04.cafe;

public class Baristar {
    Customer customer;
    String cafe;
    Menu coffee;

    Baristar(String cafe) {
        this.cafe = cafe;
    }

    void getOrder(Customer customer, String menu) {
        this.customer = customer;
        makeCoffee(menu);
    }

    void makeCoffee(String choice) {
        coffee = new Menu(choice);
        checkCounter();
    }

    public void checkCounter() {
        customer.money -= coffee.price;

        System.out.println(customer.name + "님의 남은 돈은 " + customer.money + "원 입니다. "
                            + cafe + "에서 " + coffee.name + "를 마셨습니다.");
    }
}