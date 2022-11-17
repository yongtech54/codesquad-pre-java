package day14.mission01;

public class Player {
    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }

    public void play(int time) {
        level.showLevelMessage();
        level.go(time);
    }
}