package interfaces.abstractAll;

import static util.Print.print;

public class Gerbil extends Robent {
    public Gerbil() {}

    @Override
    public void eat() {
        print("a Gerbil is eating");
    }
}
