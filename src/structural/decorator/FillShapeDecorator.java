package structural.decorator;

/**
 * Created by a-morenets (alexey.morenets@gmail.com) on 20.12.2016.
 */
public class FillShapeDecorator extends ShapeDecorator {

    FillShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
        paintOutgo = 1.5;
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
        fill();
    }

    @Override
    public double cost() {
        return decoratedShape.cost() + area() * paintOutgo;
    }

    private void fill() {
        System.out.println("Filled with color: Green, cost: " + cost());
    }
}
