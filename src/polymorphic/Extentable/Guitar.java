package polymorphic.Extentable;

import static util.Print.print;

public class Guitar extends Stringed {
    void play(Note n) {
        print("Guitar.play()" + n);
    }
    String what() {
        return "Guitar";
    }
    void adjust() {
        print("Adjusting Guitar");
    }
}
