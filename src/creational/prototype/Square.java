package creational.prototype;

/**
 * Created by user on 05.11.2014.
 */
public class Square extends Shape {
    public Square(String  id) {
        type = "Square";
        setId(id);
    }

    @Override
    protected void draw() {
        System.out.println("ShapeSquare");
    }
}
