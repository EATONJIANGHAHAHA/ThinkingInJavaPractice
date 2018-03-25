package interfaces.exe3;

public class Child extends Base {

    private int var = 6;

    @Override
    public void print() {
        System.out.println(var);
    }

    public static void main(String[] args ) {
        Child child = new Child();
        child.print();
    }
}
