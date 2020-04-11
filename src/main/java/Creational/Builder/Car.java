package Creational.Builder;

public class Car {
    private final String carBody; //must have
    private final String tyre;    //must have

    private final String engine;
    private final String aimingCircle;
    private final String decoration;
    private final String safetyBelt;

    public Car(Builder builder){
        this.carBody = builder.carBody;
        this.tyre = builder.tyre;
        this.engine = builder.engine;
        this.aimingCircle = builder.aimingCircle;
        this.decoration = builder.decoration;
        this.safetyBelt = builder.safetyBelt;
    }

    public static class Builder{
        private final String carBody;
        private final String tyre;

        private String engine;
        private String aimingCircle;
        private String decoration;
        private String safetyBelt;

        public Builder(String carBody, String tyre){
            this.carBody = carBody;
            this.tyre = tyre;
        }

        public Builder SafetyBelt(String safetyBelt) {
            this.safetyBelt = safetyBelt;
            return this;
        }
        public Builder Engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder AimingCircle(String aimingCircle) {
            this.aimingCircle = aimingCircle;
            return this;
        }

        public Builder Decoration(String decoration) {
            this.decoration = decoration;
            return this;
        }

        public Car build(){
            return  new Car(this);
        }
    }
}
