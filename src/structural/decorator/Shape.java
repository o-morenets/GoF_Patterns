package structural.decorator;

/**
 * Created by user on 06.11.2014.
 */
public abstract class Shape {
    String name = "Shape";

    public abstract double perimeter();

    public abstract double area();

    public abstract void draw();

    public abstract double cost();
}
