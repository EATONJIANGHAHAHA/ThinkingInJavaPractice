package interfaces.abstractClasses;

import static util.Print.print;

public class Percussion extends Instrument {
    public void play(Note n) {
        print("Percussion.play()" + n);
    }
    public String what() {
        return "Percussion";
    }
    public void adjust() {
        print("Adjusting Percussion");
    }
}
