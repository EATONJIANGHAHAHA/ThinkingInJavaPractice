package polymorphic.Instrument;

import static util.Print.print;

public class Brass extends Instrument {
    void play(Note n) {
        print("Instrument.play()" + n);
    }
    String what() {
        return "instrument";
    }
    void adjust() {
        print("Adjusting Instrument");
    }
}
