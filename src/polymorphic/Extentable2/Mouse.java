package polymorphic.Extentable2;

import static util.Print.print;

public class Mouse extends Robent {
    public Mouse() {}

    @Override
    public void eat() {
        print("a Mouse is eating");
    }
}
