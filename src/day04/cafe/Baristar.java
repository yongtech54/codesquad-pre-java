package day04.cafe;

public class Baristar {
    Customer customer;
    String cafeName;
    Menu coffee;

    public Baristar(String cafe) {
        this.cafeName = cafe;
    }

    public void getOrder(Customer person, String coffeeName) {
        this.customer = person;
        this.makeCoffee(coffeeName);
    }

    public void makeCoffee(String choice) {
        this.coffee = new Menu(choice);
        this.checkCounter();
    }

    public void checkCounter() {
        this.customer.money -= this.coffee.price;

        System.out.println(this.customer.name + "님의 남은 돈은 " + this.customer.money + "원 입니다. "
                            + this.cafeName + "에서 " + this.coffee.coffeeName + "을(를) 마셨습니다.");
    }
}