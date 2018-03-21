package polymorphic.Instrument;

import static util.Print.print;

public class Wind extends Instrument {
    void play(Note n) {
        print("Wind.play()" + n);
    }
    String what() {
        return "Wind";
    }
    void adjust() {
        print("Adjusting Wind");
    }
}
