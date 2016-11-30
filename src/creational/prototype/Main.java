package creational.prototype;

/**
 * Created by user on 05.11.2014.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape sh;

        sh = ShapeCache.getShape("1");
        System.out.println("Shape: " + sh.getType());
        sh.draw();

        sh = ShapeCache.getShape("2");
        System.out.println("Shape: " + sh.getType());
        sh.draw();

        sh = ShapeCache.getShape("3");
        System.out.println("Shape: " + sh.getType());
        sh.draw();
    }
}
