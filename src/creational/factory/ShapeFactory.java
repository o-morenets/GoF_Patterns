package creational.factory;

/**
 * Created by user on 04.11.2014.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        Shape shape = null;
        if (shapeType.equalsIgnoreCase("Circle")) {
            shape = new Circle(0.00f);
        } else {
            if (shapeType.equalsIgnoreCase("Rectangle")) {
                shape = new Rectangle(0.00d, 0.00d);
            } else {
                if (shapeType.equalsIgnoreCase("Square")) {
                    shape = new Square(0L);
                }
            }
        }
        return shape;
    }
}
