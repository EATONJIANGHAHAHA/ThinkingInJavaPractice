package polymorphic.Meal;

import static util.Print.print;

public class Sandwich extends PortableLunch {
    private Bread bread = new Bread();
    private Chees chees = new Chees();
    private Lettuce lettuce = new Lettuce();
    private Pickle pickle = new Pickle();
    private Sandwich() {
        print("Sandwich");
    }
    public static void main(String[] args) {
        new Sandwich();
    }
}
