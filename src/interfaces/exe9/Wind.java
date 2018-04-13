package interfaces.exe9;

import static util.Print.print;

public class Wind extends Instrument {
    public void play(Note n) {
        print("Wind.play()" + n);
    }
    public String what() {
        return "Wind";
    }
    public void adjust() {
        print("Adjusting Wind");
    }
}
