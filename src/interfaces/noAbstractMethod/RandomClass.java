package interfaces.noAbstractMethod;

import static util.Print.print;

public class RandomClass extends NoAb {

    @Override
    public void output() {
        print("myRandomClass");
    }
}
