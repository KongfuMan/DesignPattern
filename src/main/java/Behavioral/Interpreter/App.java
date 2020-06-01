package Behavioral.Interpreter;

import java.util.Stack;

public class App {
    public static boolean isOperator(char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    public static void main(String[] args) {
        final String exp = "1 + 3 + 4 - 2";

        Stack<Expression> stack = new Stack<>();
        int i = 0;
        while(i < exp.length()){
            char c = exp.charAt(i);
            if (isOperator(c)){
                char next = exp.charAt(++i);

            }else{
                Expression numExp = new NumberExpression();
                stack.push(numExp);
            }
            i++;
        }
    }
}
