package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random(90);

        Player p1 = new Player(90+random.nextInt(11));
        Player p2 = new Player(90+random.nextInt(11));
        Player p3 = new Player(90+random.nextInt(11));
        Player p4 = new Player(90+random.nextInt(11));
        Player p5 = new Player(90+random.nextInt(11));
        Player p6 = new Player(90+random.nextInt(11));
        for (int i = 0; i < 100; i++) {
            p1.run();
        }
        Player.info();
    }
}
