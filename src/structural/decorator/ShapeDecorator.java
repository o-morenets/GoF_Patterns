package structural.decorator;

/**
 * Created by user on 06.11.2014.
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    protected ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
