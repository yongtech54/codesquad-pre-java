package day04.cafe;

public class Menu {
    String coffeeName;
    int price;

    public Menu(String menuChoice) {
        this.coffeeName = menuChoice;
        setPrice(this.coffeeName);
    }

    public void setPrice(String menu) {
        if (menu.equals("아메리카노")) {
            this.price = 4000;
        }
        if (menu.equals("라떼")) {
            this.price = 5000;
        }
    }
}
