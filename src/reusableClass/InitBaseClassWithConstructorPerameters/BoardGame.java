package reusableClass.InitBaseClassWithConstructorPerameters;

import static util.Print.print;

public class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame cons");
    }
}
