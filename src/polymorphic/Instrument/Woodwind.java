package polymorphic.Instrument;

import static util.Print.print;

public class Woodwind extends Wind {

    void play(Note n) {
        print("Wodwind.play()");
    }

    String what() {
        return "Woodwind";
    }

    void adjust() {
        print("Adjusting Woodwind");
    }
}
