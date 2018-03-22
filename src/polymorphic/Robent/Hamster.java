package polymorphic.Robent;

import static util.Print.print;

public class Hamster extends Robent {
    public Hamster() {}

    @Override
    public void eat() {
        print("a Hamster is eating");
    }
}
