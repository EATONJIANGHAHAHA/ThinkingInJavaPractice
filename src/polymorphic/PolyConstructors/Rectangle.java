package polymorphic.PolyConstructors;

import static util.Print.print;

public class Rectangle {

    public Rectangle() {
        print("before:");
        draw();
        print("after");
    }

    protected void draw() {
        print("Rectangle.draw()");
    }
}
