package Behavioral.Delegate;

public class LG implements OLed {
    @Override
    public void produce() {
        System.out.println("LG OLed Screen");
    }
}
