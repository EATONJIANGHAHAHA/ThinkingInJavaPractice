package polymorphic.CallingOrderOfOverridedMethod;

import static util.Print.print;

public class Vehical {

    public Vehical() {}

    public void decelerate(){
        useBreak();
        print("decelerating");
    }

    protected void useBreak() {
        print("The break is been used");
    }
}
