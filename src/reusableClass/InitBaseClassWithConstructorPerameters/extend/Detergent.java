package reusableClass.InitBaseClassWithConstructorPerameters.extend;

import static util.Print.print;

public class Detergent {

    Cleanser cleanser;

    Detergent() {
        cleanser = new Cleanser();
    }

    public void append(String s) {
        cleanser.append(s);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.append(" Detergent.scrub()");
    }

    public void foam() {
        cleanser.append(" foam()");
    }

    public static void main(String[] args) {

    }
}
