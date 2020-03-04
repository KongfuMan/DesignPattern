package Behavioral.Delegate;

public class Xiaomi {
    OLedDelegate oLedDelegate;

    public Xiaomi(OLedDelegate delegate){
        this.oLedDelegate = delegate;
    }

    public void startToProduceLed(int num){
        oLedDelegate.massivelyProduce(num);
    }
}
