package reusableClass.InitBaseClassWithConstructorPerameters.Root;

import static util.Print.print;

public class Stem extends Root {
    public Stem() {
        super(1);
        print("Stem");
    }

    public static void main( String[] args) {
        Stem stem = new Stem();
    }
}
