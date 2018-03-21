package reusableClass.InitBaseClassWithConstructorPerameters.Root;

import static util.Print.print;

public class Root {

    public Component1 c1 = new Component1(1);
    public Component2 c2 = new Component2(1);
    public Component3 c3 = new Component3(1);

    public Root(int i) {
        print("Root");
    }
}
