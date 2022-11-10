package day09.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Gamer {
    private int money;
    private int round = 0;
    private Random random = new Random();
    private static Memento memento = new Memento(1000);

    private ArrayList<String> fruits = new ArrayList<>();
    private static String[] fruitsName = {"사과", "샤인머스킷", "귤"};
    private static int fruitsCnt = 0;
    private static String myFruits = "";

    public boolean rollDice() {
        if (money == 0) {
            System.out.println("게임을 종료합니다");
            return false;
        }

        round++;
        int dice = random.nextInt(6) + 1;

        System.out.printf("========[round %d]========\n", round);

        if (dice == 1 || dice == 3) {
            System.out.printf("[+Money] %d원 -> ", money);
            money += 100;
            System.out.printf("%d원\n", money);

            if (this.money > memento.getMoney()) {
                createMemento();
            }

        } else if (dice == 2 || dice == 4) {
            System.out.printf("[-Money] %d원 -> ", money);
            money /= 2;
            System.out.printf("%d원\n", money);

            if (this.money < memento.getMoney() / 2) {
                restoreMemento();
            }
        } else if (dice == 6) {
            getFruits();
        } else {
            System.out.println("[무효] 변한 값이 없습니다.");
        }

        return true;
    }

    public String toStr() {
        return String.format("[Player state] Money: %d원\n과일 >> ", money) + Arrays.toString(fruits.toArray());
    }

    public void createMemento() {
        memento.setMoney(money);
        memento.setFruits(fruits);
        System.out.printf("[저장] %d원\n", money);
    }

    public void restoreMemento() {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
        System.out.printf("[불러오기] %d원\n", money);
    }
    public void getFruits() {
        myFruits = fruitsName[fruitsCnt];
        System.out.printf("[%s 획득]\n", myFruits);
        fruits.add(myFruits);
        fruitsCnt++;

        if (fruitsCnt == fruitsName.length) {
            fruitsCnt = 0;
        }
    }

    public Gamer(int money) {
        this.money = money;
    }
}
