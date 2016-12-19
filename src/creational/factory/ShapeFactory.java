package creational.factory;

/**
 * Created by user on 04.11.2014.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        Shape shape = null;
        if (shapeType.equalsIgnoreCase("ShapeCircle")) {
            shape = new Circle();
        } else {
            if (shapeType.equalsIgnoreCase("ShapeRectangle")) {
                shape = new Rectangle();
            } else {
                if (shapeType.equalsIgnoreCase("ShapeSquare")) {
                    shape = new Square();
                }
            }
        }
        return shape;
    }
}
