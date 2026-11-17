package Annotation.FunctionPointers;

import java.lang.invoke.MethodHandle;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {
        FunctionPointerAnnotation myFuncInterface = CalculatorImpl::add;
        System.out.println("Execution result is " + myFuncInterface.execute(3,4));

        Supplier<Integer> s = () -> 3;
        Consumer<String> consumer = (String in) -> System.out.println("Consumer input is "  + in);
        consumer.accept(" my consumer input");

        BiFunction<String, String, String> bifunc = (String a, String b) -> {
            return a + b;
        };
        System.out.println("bifunc: "  + bifunc.apply("a", "b"));

        Predicate<Integer> p = (Integer a) -> a > 10;
        System.out.println("Predicate output: " + p.test(11));
    }
}
