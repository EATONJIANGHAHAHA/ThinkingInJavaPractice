package polymorphic.shapes;

import static util.Print.print;

public class Square extends Shape {

    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.draw()");
    }

    @Override
    public void expend() {
        print("Square.expend()");
    }
}
