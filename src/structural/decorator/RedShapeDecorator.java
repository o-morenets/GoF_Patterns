package structural.decorator;

/**
 * Created by user on 06.11.2014.
 */
public class RedShapeDecorator extends ShapeDecorator {
    protected RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setBorder(decoratedShape);
    }

    private void setBorder(Shape decoratedShape) {
        System.out.println("Border color: RED");
    }
}
