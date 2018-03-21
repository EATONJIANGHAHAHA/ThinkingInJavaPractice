package reusableClass.InitBaseClassWithConstructorPerameters;

import static util.Print.print;

public class Chess extends BoardGame {
    Chess() {
        /**/
        super(1);
        print("Chess cons");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
