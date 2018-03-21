package reusableClass.InitBaseClassWithConstructorPerameters.LevelThreeExtends;

public class ClassC extends ClassA {

    ClassC() {
        super(1);
        ClassB classb = new ClassB(1);
    }

    public static void main(String[] args) {
        ClassC x = new ClassC();
    }

    /* output:
    this is ClassA
    this is ClassB*/
}
