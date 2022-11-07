package day04.cafe;

public class Menu {
    static void checkPrice(Coffee coffee) {
        if (coffee.name.equals("아메리카노")) {
            coffee.price = 4000;
            return;
        }
        if (coffee.name.equals("라떼")) {
            coffee.price = 5000;
            return;
        }
    }
}
