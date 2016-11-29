package creational.factory;

/**
 * Created by user on 04.11.2014.
 */
public class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I am CIRCLE. Radius = " + radius);
    }
}
