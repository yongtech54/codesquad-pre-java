package day09.game;

import java.util.ArrayList;

public class Memento {
    private int money;
    private ArrayList<String> fruits = new ArrayList<String>();

    Memento(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setFruits(ArrayList<String> fruits) {
        this.fruits = fruits;
    }
    public ArrayList<String> getFruits() {
        return fruits;
    }

}
