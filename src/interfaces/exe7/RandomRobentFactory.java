package interfaces.exe7;

import java.util.Random;

public class RandomRobentFactory {

    public Robent newRobent() {
        Random random = new Random();
        switch (random.nextInt(4)) {
            case 0:
                return new Mouse();
            case 1:
                return new Mouse();
            case 2:
                return new Gerbil();
            case 3:
                return new Hamster();
        }
        return null;
    }
}
