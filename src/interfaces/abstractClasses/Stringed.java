package interfaces.abstractClasses;

import static util.Print.print;

public class Stringed extends Instrument {
    public void play(Note n) {
        print("Stringed.play()" + n);
    }
    public String what() {
        return "Stringed";
    }
    public void adjust() {
        print("Adjusting Stringed");
    }
}
