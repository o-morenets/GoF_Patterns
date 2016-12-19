package creational.factory;

/**
 * Created by user on 04.11.2014.
 */
public class Rectangle implements Shape {
    private double a;
    private double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("I am RECTANGLE. a = " + a + "; b = " + b);
    }
}
