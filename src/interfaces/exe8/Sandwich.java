package interfaces.exe8;

import static util.Print.print;

public class Sandwich extends PortableLunch implements Fastfood{
    private Bread bread = new Bread();
    private Chees chees = new Chees();
    private Lettuce lettuce = new Lettuce();
    private Pickle pickle = new Pickle();
    private Sandwich() {
        print("Sandwich");
    }
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.order();
    }

    @Override
    public void order() {
        print("ordering");
    }
}
