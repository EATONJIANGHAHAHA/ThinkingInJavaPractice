package reusableClass.InitializeBaseClass.LevelThreeExtends;

public class ClassC extends ClassA {

    ClassB classb = new ClassB();

    public static void main(String[] args) {
        ClassC x = new ClassC();
    }

    /* output:
    this is ClassA
    this is ClassB*/
}
