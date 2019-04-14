package Behavioral.Strategy;

public class FlapFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flap Fly");
    }
}
