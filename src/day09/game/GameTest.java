package day09.game;

public class GameTest {
    public static void main(String[] args) {
        Gamer player = new Gamer(1000);
        int i = 0;

        while (player.rollDice()) {
            i++;
            if (i == 100) {
                break;
            }
        }
        System.out.println(player.toStr());
    }
}