package creational.factory;

/**
 * Created by user on 04.11.2014.
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        try {
            sf.getShape("cIrClE").draw();
            sf.getShape("RectAngle").draw();
            sf.getShape("SqUaRe").draw();
            sf.getShape("Cone").draw();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
