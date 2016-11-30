package creational.prototype;

/**
 * Created by user on 05.11.2014.
 */
public class Circle extends Shape {
    public Circle(String  id) {
        type = "Circle";
        setId(id);
    }

    @Override
    protected void draw() {
        System.out.println("Circle");
    }
}
