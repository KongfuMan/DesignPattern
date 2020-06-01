package Behavioral.Interpreter;

public class PlusExpression extends Expression {
    private Expression left;
    private Expression right;

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }

    @Override
    public String toString(){
        return left.toString() + " + " + right.toString();
    }
}
