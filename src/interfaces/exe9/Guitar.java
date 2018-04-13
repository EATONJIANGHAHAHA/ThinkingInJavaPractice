package interfaces.exe9;

import static util.Print.print;

public class Guitar extends Stringed {
    public void play(Note n) {
        print("Guitar.play()" + n);
    }
    public String what() {
        return "Guitar";
    }
    public void adjust() {
        print("Adjusting Guitar");
    }
}
