package polymorphic.Extentable;

import static util.Print.print;

public class Brass extends Instrument {
    void play(Note n) {
        print("Brass.play()" + n);
    }
    String what() {
        return "Brass";
    }
    void adjust() {
        print("Adjusting Brass");
    }
}
