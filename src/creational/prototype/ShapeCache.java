package creational.prototype;

import java.util.Hashtable;

/**
 * Created by user on 05.11.2014.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeID) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeID);
        return (Shape)cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square("3");
        shapeMap.put(square.getId(), square);
    }
}
