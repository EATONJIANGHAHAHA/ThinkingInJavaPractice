package reusableClass.extend;

import static util.Print.print;

public class NewDetergent extends Detergent {

    @Override
    public void scrub() {
        append("NewDetergent.scrub()");
        super.scrub();
    }

    public void sterilizer() {
        append("sterilizer()");
    }

    public static void main(String[] args) {
        NewDetergent x = new NewDetergent();
        x.scrub();
        x.sterilizer();
        print(x);
    }
}
