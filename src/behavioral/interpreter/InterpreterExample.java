package behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Interpreter pattern example
 * Created by a-morenets (alexey.morenets@gmail.com) on 09.12.2016.
 */

public class InterpreterExample {

    public static void main(final String[] args) {
        final String expression = "w x z - +";
        final Evaluator sentence = new Evaluator(expression);
        final Map<String, Expression> variables = new HashMap<>();
        variables.put("w", new Number(5));
        variables.put("x", new Number(10));
        variables.put("z", new Number(42));
        final int result = sentence.interpret(variables);
        System.out.println(result);
    }

}