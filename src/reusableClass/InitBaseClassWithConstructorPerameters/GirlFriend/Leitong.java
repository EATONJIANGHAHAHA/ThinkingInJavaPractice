package reusableClass.InitBaseClassWithConstructorPerameters.GirlFriend;

import static util.Print.print;

public class Leitong extends Girl{
    Leitong() {
        super("Leitong");
        print("I am Leitong");
    }

    Leitong(String s) {
        super(s);
        print("I am Leitong");
    }

    public static void main(String[] args) {
        Leitong xiaomao = new Leitong("big boos");
    }
}
