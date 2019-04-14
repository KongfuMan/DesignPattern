package Behavioral.Strategy;

public class JetFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Jet Fly");
    }
}
