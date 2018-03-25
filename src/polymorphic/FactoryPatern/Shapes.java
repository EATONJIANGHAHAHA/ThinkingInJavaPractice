package polymorphic.FactoryPatern;

public class Shapes {

    private static RandomShapeFactory randomShapeFactory = new RandomShapeFactory();

    public static void main(String... args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i < s.length;i++) {
            s[i] = randomShapeFactory.newShape();
        }
        for(Shape shape: s){
            shape.draw();
            shape.expend();
        }
    }
}
