package Creational.StepBuilder;

public class Car {
    private String carBody; //must have
    private String tyre;    //must have
    private String safetyBelt;

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public void setSafetyBelt(String safetyBelt) {
        this.safetyBelt = safetyBelt;
    }
}
