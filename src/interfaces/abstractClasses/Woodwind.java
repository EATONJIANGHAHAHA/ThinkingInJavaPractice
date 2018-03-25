package interfaces.abstractClasses;

import static util.Print.print;

public class Woodwind extends Wind {

    public void play(Note n) {
        print("Wodwind.play()");
    }

    public String what() {
        return "Woodwind";
    }

    public void adjust() {
        print("Adjusting Woodwind");
    }
}
