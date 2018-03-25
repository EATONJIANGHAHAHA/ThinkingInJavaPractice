package polymorphic.DownCasting;

import static util.Print.print;

public class Bicycle extends Cycle {

    public Bicycle() {
        print("I am a Bicycle");
    }

    @Override
    public void wheels() {
        print("2");
    }

    @Override
    public String toString() {
        return "Bicycle";
    }

    public void balance() {
        print("balancing bicycle");
    }
}
