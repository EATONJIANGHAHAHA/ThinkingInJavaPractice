package polymorphic.Upcasting;

import static util.Print.print;

public class Tricycle extends Cycle {

    public Tricycle() {
        print("I am a Tricycle");
    }

    @Override
    public void wheels() {
        print("3");
    }

    @Override
    public String toString() {
        return "Tricycle";
    }
}
