package polymorphic.Extentable;

import static util.Print.print;

public class Instrument {
    void play(Note n) {
        print("Extentable.play()" + n);
    }
    String what() {
        return "Extentable";
    }
    void adjust() {
        print("Adjusting Extentable");
    }
}
