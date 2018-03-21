package polymorphic.Instrument;

import static util.Print.print;

public class Stringed extends Instrument {
    void play(Note n) {
        print("Stringed.play()" + n);
    }
    String what() {
        return "Stringed";
    }
    void adjust() {
        print("Adjusting Stringed");
    }
}
