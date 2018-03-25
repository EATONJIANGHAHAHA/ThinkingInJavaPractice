 package polymorphic.DownCasting;

 import static util.Print.print;

 public class DownCasting {

    public static void main(String... args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        DownCasting upcasting = new DownCasting();
        upcasting.ride(unicycle);
        upcasting.ride(bicycle);
        upcasting.ride(tricycle);

        //below are up casting.
        print("DownCasting from child class and then down cast using that reference");
        Cycle[] cycle = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
        //cycle[0].balance();
        //compile time error: balance() not exist in father class.
        ((Unicycle)cycle[0]).balance();
        ((Bicycle)cycle[1]).balance();
        //((Tricycle)cycle[2]).balance();
        //comppile time error: balance() not exist in tricycle class.

        print("Pure down casting, using father object");
        Cycle cycle2 = new Cycle();
        ((Unicycle)cycle2).balance();// this will throw a ClassCastException.
    }

    public void ride(Cycle cycle) {
        cycle.wheels();
    }
}
