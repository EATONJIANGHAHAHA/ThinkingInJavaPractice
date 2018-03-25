package polymorphic.FactoryPatern;

import java.util.Random;

public class RandomShapeFactory {
    private Random rand = new Random(47);
    public Shape newShape() {
        switch (rand.nextInt(3)) {
            case 0: return new Circle();
            case 1: return new Triangle();
            case 2: return new Square();
        }
        return null;
    }
}
