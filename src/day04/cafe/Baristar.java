package day04.cafe;

public class Baristar {
    Customer customer;
    String cafe;
    Coffee coffee;

    Baristar(String cafe) {
        this.cafe = cafe;
    }

    void getOrder(Customer customer, String menu) {
        this.customer = customer;
        makeCoffee(menu);
    }

    void makeCoffee(String menu) {
        coffee = new Coffee(menu);
        checkCounter();
    }

    public void checkCounter() {
        Menu.checkPrice(coffee);
        customer.money -= coffee.price;

        System.out.println(customer.name + "님의 남은 돈은 " + customer.money + "원 입니다. "
                            + cafe + "에서 " + coffee.name + "를 마셨습니다.");
    }
}