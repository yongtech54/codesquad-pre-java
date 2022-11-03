package day04.change;

public class Customer {
    public int money;
    public String name;
    public String[] choiceInfo = new String[2];

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String[] order(String cafe, String menu) {
        this.choiceInfo[0] = cafe;
        this.choiceInfo[1] = menu;

        return this.choiceInfo;
    }
}
