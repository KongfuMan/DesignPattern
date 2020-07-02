package Behavioral.Delegate;

public class Main {
    public static void main(String[] args) {
        Xiaomi xm = new Xiaomi(new OLedDelegate(new Samsumg()));
        xm.startToProduceLed(5);
    }
}
