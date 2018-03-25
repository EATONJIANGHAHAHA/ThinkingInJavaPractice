package polymorphic.Vehical;

import static util.Print.print;

public class Bus extends Vehical {

    public Bus() {}

    @Override
    protected void useBreak() {
        print("a Bus is using a break");
    }
}
