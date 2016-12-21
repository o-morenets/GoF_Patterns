package structural.decorator;

/**
 * Created by user on 06.11.2014.
 */
public class Rectangle extends Shape {
    private double a;
    private double b;

    Rectangle() {
        name = "Rectangle";
    }

    public Rectangle(double a, double b) {
        this();
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public void draw() {
        System.out.println("I am " + name + ", cost: " + cost());
    }

    @Override
    public double cost() {
        return 2 * a * b;
    }
}
