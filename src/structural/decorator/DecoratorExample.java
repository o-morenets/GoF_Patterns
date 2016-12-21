package structural.decorator;

/**
 * Created by user on 06.11.2014.
 */
public class DecoratorExample {

    public static void main(String[] args) {
        new Circle(10).draw();
        new Rectangle(2, 3).draw();
        System.out.println();

        new RedBorderDecorator(new Circle(10)).draw();
        new RedBorderDecorator(new Rectangle(2, 3)).draw();
        System.out.println();

        Shape circle = new Circle(10);
        circle = new FillShapeDecorator(circle);
        circle = new RedBorderDecorator(circle);
        circle.draw();

        Shape rectangle = new Rectangle(2, 3);
        rectangle = new FillShapeDecorator(rectangle);
        rectangle = new RedBorderDecorator(rectangle);
        rectangle.draw();
    }
}
