package structural.decorator;

/**
 * Created by user on 06.11.2014.
 */
public class Circle extends Shape {
    private double radius;

    Circle() {
        name = "Circle";
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("I am " + name + ", cost: " + cost());
    }

    @Override
    public double cost() {
        return 2 * radius;
    }
}
