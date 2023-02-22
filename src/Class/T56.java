package Class;

import java.util.concurrent.ThreadLocalRandom;

public class T56 implements Weapon {
    int rand;
    @Override
    public void shoot() {
        ThreadLocalRandom random = ThreadLocalRandom. current();
        rand = random. nextInt(1, 11);
    }

    @Override
    public int getScore() {

        return rand;
    }
}
