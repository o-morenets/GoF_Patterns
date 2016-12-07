package structural.bridge;

/**
 * Created by a-morenets (alexey.morenets@gmail.com) on 07.12.2016.
 */

/**
 * Drawer.java
 */
interface Drawer {
    public void drawCircle(int x, int y, int radius);
}

/**
 * SmallCircleDrawer.java
 */
class SmallCircleDrawer implements Drawer {
    private static final double radiusMultiplier = 0.25;

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius * radiusMultiplier);
    }
}

/**
 * LargeCircleDrawer.java
 */
class LargeCircleDrawer implements Drawer {
    private static final int radiusMultiplier = 10;

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Large circle center = " + x + "," + y + " radius = " + radius * radiusMultiplier);
    }
}

/**
 * Shape.java
 */
abstract class Shape {

    protected Drawer drawer;

    protected Shape(Drawer drawer) {
        this.drawer = drawer;
    }

    public abstract void draw();

    public abstract void enlargeRadius(int multiplier);
}


/**
 * Файл Circle.java
 */
class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, Drawer drawer) {
        super(drawer);
        setX(x);
        setY(y);
        setRadius(radius);
    }

    @Override
    public void draw() {
        drawer.drawCircle(x, y, radius);
    }

    @Override
    public void enlargeRadius(int multiplier) {
        radius *= multiplier;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

/**
 * Класс, показывающий работу шаблона проектирования "Мост".
 * BridgeExample.java
 */
public class BridgeExample {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, 10, 10, new LargeCircleDrawer()),
                new Circle(20, 30, 100, new SmallCircleDrawer())};

        for (Shape next : shapes) {
            next.draw();
        }
    }
}