package interfaces.abstractClasses;

import static util.Print.print;

abstract class Instrument {
    private int i; // storage allocated for each
    public abstract void play(Note n);
    public String what() {
        return "Extentable";
    }
    public abstract void adjust();
}
