package Behavioral.Strategy;

public class DisplayGreen implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("Display as green");
    }
}
