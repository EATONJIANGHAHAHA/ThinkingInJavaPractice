package polymorphic.Instrument;

import static util.Print.print;

public class Percussion extends Instrument {
    void play(Note n) {
        print("Percussion.play()" + n);
    }
    String what() {
        return "Percussion";
    }
    void adjust() {
        print("Adjusting Percussion");
    }
}
