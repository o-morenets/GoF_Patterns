package behavioral.strategy;

/**
 * Created by user on 04.11.2014.
 */
public class AddOperation implements Operation {
    @Override
    public double doOperation(double num1, double num2) {
        return num1 + num2;
    }
}
