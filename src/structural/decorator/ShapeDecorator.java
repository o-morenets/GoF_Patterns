package structural.decorator;

/**
 * Created by user on 06.11.2014.
 */
public abstract class ShapeDecorator extends Shape {

    /* Paint outgo */
    double paintOutgo;

    Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
