package behavioral.interpreter;

import java.util.Map;

/**
 * Interpreter pattern example
 * Created by a-morenets (alexey.morenets@gmail.com) on 09.12.2016.
 */

interface Expression {
    int interpret(final Map<String, Expression> variables);
}

class Number implements Expression {
    private int number;

    Number(final int number) {
        this.number = number;
    }

    public int interpret(final Map<String, Expression> variables) {
        return number;
    }
}

class Plus implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    Plus(final Expression left, final Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(final Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}

class Minus implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    Minus(final Expression left, final Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(final Map<String, Expression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}

class Variable implements Expression {
    private String name;

    Variable(final String name) {
        this.name = name;
    }

    public int interpret(final Map<String, Expression> variables) {
        if (null == variables.get(name)) return 0; // Either return new Number(0).
        return variables.get(name).interpret(variables);
    }
}