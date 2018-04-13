package interfaces.exe7;

import static util.Print.print;

public class Gerbil implements Robent {
    public Gerbil() {}

    @Override
    public void eat() {
        print("a Gerbil is eating");
    }
}
