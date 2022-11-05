package day04.cafe;

public class Menu {
    String name;
    int price;

    Menu(String menuChoice) {
        name = menuChoice;
        setPrice(name);
    }

    void setPrice(String menu) {
        if (menu.equals("아메리카노")) {
            price = 4000;
        }
        if (menu.equals("라떼")) {
            price = 5000;
        }
    }
}
