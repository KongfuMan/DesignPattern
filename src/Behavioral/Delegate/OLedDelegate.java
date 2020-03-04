package Behavioral.Delegate;

public class OLedDelegate {
    private OLed oled;
    public OLedDelegate(OLed oled){
        this.oled = oled;
    }

    public void massivelyProduce(int num){
        for (int i = 0; i < num; i++){
            oled.produce();
        }
        System.out.println("The delegate have already produced"+ num + "OLed Screens");
    }
}
