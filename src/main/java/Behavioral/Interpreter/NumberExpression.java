package Behavioral.Interpreter;

public class NumberExpression extends Expression {
    private int num;

    @Override
    public int interpret() {
        return num;
    }

    @Override
    public String toString(){
        return String.valueOf(num);
    }
}
