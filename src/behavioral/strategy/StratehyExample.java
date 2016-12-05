package behavioral.strategy;

/**
 * Created by user on 04.11.2014.
 */
public class StratehyExample {
    public static void main(String[] args) {
        System.out.println(new Strategy(new AddOperation()).applyStrategy(10, 5));
        System.out.println(new Strategy(new SubstractOperation()).applyStrategy(10, 5));
        System.out.println(new Strategy(new MultiplyOperation()).applyStrategy(10, 5));
    }
}
