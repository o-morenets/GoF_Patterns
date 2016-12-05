package structural.decorator;

/**
 * Created by user on 06.11.2014.
 */
public class DecoratorExample {

    public static void main(String[] args) {
        new Circle().draw();
        new Rectangle().draw();
        System.out.println();
        new RedShapeDecorator(new Circle()).draw();
        new RedShapeDecorator(new Rectangle()).draw();
    }
}
