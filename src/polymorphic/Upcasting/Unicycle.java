package polymorphic.Upcasting;

import static util.Print.print;

public class Unicycle extends Cycle {

    public Unicycle() {
        print("I am a Unicycle");
    }

    @Override
    public void wheels() {
        print("1");
    }

    @Override
    public String toString() {
        return "Unicycle";
    }
}
