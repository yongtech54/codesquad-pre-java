package day14.mission01;

public class MainBoard {

    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvancedLevel nextLevel = new AdvancedLevel();
        player.upgradeLevel(nextLevel);
        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);
    }
}