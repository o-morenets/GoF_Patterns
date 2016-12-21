package structural.decorator;

/**
 * Created by user on 06.11.2014.
 */
public class RedBorderDecorator extends ShapeDecorator {

    RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
        paintOutgo = 0.5;
    }

    @Override
    public double perimeter() {
        return decoratedShape.perimeter();
    }

    @Override
    public double area() {
        return decoratedShape.area();
    }

    @Override
    public void draw() {
        super.draw();
        setBorder();
    }

    @Override
    public double cost() {
        return decoratedShape.cost() + perimeter() * paintOutgo;
    }

    private void setBorder() {
        System.out.println("Border color: RED, cost: " + cost());
    }
}
