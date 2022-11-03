package day04.change;

public class Cafe {
    private static Customer person;
    private static int change;
    private static int iceAmericano = 4000;
    private static int latte = 5000;
    private static String cafe;
    private static String menu;

    public static void getOrder(Customer customer, String[] order) {
        person = customer;
        cafe = order[0];
        menu = order[1];
    }

    public static int getCounter() {
        if (menu.equals("아이스 아메리카노")) {
            person.money = person.money - iceAmericano;
            return person.money;
        }
        person.money = person.money - latte;
        return person.money;
    }
    public static void toCustomer() {
        Cafe.getCounter();
        System.out.println(person.name + "님의 남은 돈은 " + person.money + "원입니다. " +
                            cafe + "에서 " + menu + "를 마셨습니다.");

    }
}
