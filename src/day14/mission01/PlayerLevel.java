package day14.mission01;

public abstract class PlayerLevel {
        abstract void run();
        abstract void jump();
        abstract void turn();
        abstract void showLevelMessage();

        public final void go(int time) {
            run();
            for(int i =0; i < time; i++) {
                jump();
            }
            turn();
        }
}
