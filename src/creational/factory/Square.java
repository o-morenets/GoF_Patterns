package creational.factory;

/**
 * Created by user on 04.11.2014.
 */
public class Square implements Shape {
    private long x;

    public Square(long x) {
        this.x = x;
    }

    @Override
    public void draw() {
        System.out.println("I am SQUARE. x = " + x);
    }
}
