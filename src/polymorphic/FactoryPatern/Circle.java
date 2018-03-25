package polymorphic.FactoryPatern;

import static util.Print.print;

public class Circle extends Shape {

    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }

    @Override
    public void expend() {
        print("Circle.expend()");
    }
}
