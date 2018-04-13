package interfaces.exe5;

import interfaces.exe5.package1.whatever;

import static util.Print.print;

public class Exe5 implements whatever {

    @Override
    public void what() {
        print("what()");
    }

    @Override
    public void where() {
        print("where()");
    }

    @Override
    public void how() {
        print("how()");
    }

    public static void main(String[] args) {
        Exe5 exe5 = new Exe5();
        exe5.how();
        exe5.what();
        exe5.where();
    }
}
