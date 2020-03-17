package Behavioral.Strategy;

public class HighQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack high");
    }
}
