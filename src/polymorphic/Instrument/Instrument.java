package polymorphic.Instrument;

import static util.Print.print;

public class Instrument {
    void play(Note n) {
        print("Instrument.play()" + n);
    }
    String what() {
        return "Instrument";
    }
    void adjust() {
        print("Adjusting Instrument");
    }
}
