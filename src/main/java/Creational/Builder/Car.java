package Creational.Builder;

public class Car {
    private final String carBody;
    private final String tyre;

    private final String engine;
    private final String aimingCircle;
    private final String decoration;
    private final String safetyBelt;

    private Car(CarBuilder builder) {
        this.carBody = builder.carBody;
        this.tyre = builder.tyre;
        this.engine = builder.engine;
        this.aimingCircle = builder.aimingCircle;
        this.decoration = builder.decoration;
        this.safetyBelt = builder.safetyBelt;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String carBody;
        private String tyre;

        private String engine;        //optional field
        private String aimingCircle;  //optional field
        private String decoration;    //optional field
        private String safetyBelt;    //optional field

        public CarBuilder() {
        }

        public CarBuilder withBody(String carBody) {
            this.carBody = carBody;
            return this;
        }

        public CarBuilder withTyre(String tyre) {
            this.tyre = tyre;
            return this;
        }

        public CarBuilder withSafetyBelt(String safetyBelt) {
            this.safetyBelt = safetyBelt;
            return this;
        }

        public CarBuilder withEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder withAimingCircle(String aimingCircle) {
            this.aimingCircle = aimingCircle;
            return this;
        }

        public CarBuilder withDecoration(String decoration) {
            this.decoration = decoration;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
