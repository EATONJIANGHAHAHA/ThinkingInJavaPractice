package interfaces.exe9;

import static util.Print.print;

public class Brass extends Instrument {
    public void play(Note n) {
        print("Brass.play()" + n);
    }
    public String what() {
        return "Brass";
    }
    public void adjust() {
        print("Adjusting Brass");
    }
}
