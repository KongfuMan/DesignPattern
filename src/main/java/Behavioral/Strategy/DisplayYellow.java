package Behavioral.Strategy;

public class DisplayYellow implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("Display as yellow");
    }
}
