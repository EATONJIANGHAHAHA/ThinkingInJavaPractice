package polymorphic.Upcasting;

import static util.Print.print;

public class Upcasting {

    public static void main(String... args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Upcasting upcasting = new Upcasting();
        upcasting.ride(unicycle);
        upcasting.ride(bicycle);
        upcasting.ride(tricycle);
    }

    public void ride(Cycle cycle) {
        cycle.wheels();
    }
}
