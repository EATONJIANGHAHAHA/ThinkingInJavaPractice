package interfaces.exe3;

abstract class Base {

    public void Base() {
        System.out.println("Base() before print()");
        print();
        System.out.println("Base() after print()");
    }

    abstract public void print();

}
