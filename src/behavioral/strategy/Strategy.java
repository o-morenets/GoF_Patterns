package behavioral.strategy;

/**
 * Created by user on 04.11.2014.
 */
public class Strategy {
    private Operation operation;

    public Strategy(Operation operation) {
        this.operation = operation;
    }

    public double applyStrategy(double num1, double num2) {
        return operation.doOperation(num1, num2);
    }
}
