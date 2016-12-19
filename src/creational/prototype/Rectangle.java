package creational.prototype;

/**
 * Created by user on 05.11.2014.
 */
public class Rectangle extends Shape {
    public Rectangle(String  id) {
        type = "Rectangle";
        setId(id);
    }

    @Override
    protected void draw() {
        System.out.println("ShapeRectangle");
    }
}
