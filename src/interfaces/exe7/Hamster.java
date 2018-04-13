package interfaces.exe7;

import static util.Print.print;

public class Hamster implements Robent {
    public Hamster() {}

    @Override
    public void eat() {
        print("a Hamster is eating");
    }
}
