package polymorphic.PolyConstructors;

public class RectangularGlyph extends Rectangle {

    int length = 5;

    public RectangularGlyph(int number) {
        System.out.println("RectangularGlyph + length " + length);
    }

    @Override
    public void draw(){
        System.out.println("RectangularGlyph.draw() + length " + length);
    }
}
