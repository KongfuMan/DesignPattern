package Creational.StepBuilder;

public class CarBuilder {
    public static ICarBody createBuilder() {
        return new CarBuilderStep();
    }

    public interface ICarBody {
        ISafetyBelt withCarBody(String carBody);
    }

    public interface ISafetyBelt {
        ITyre withSafetyBelt(String safetyBelt);
    }

    public interface ITyre {
        IBuilder withTyre(String tyre);
    }

    public interface IBuilder {
        Car build();
    }


    public static class CarBuilderStep implements ICarBody, ISafetyBelt, ITyre, IBuilder{
        private String carBody;
        private String safetyBelt;
        private String tyre;
        @Override
        public ISafetyBelt withCarBody(String carBody) {
            this.carBody = carBody;
            return this;
        }

        @Override
        public ITyre withSafetyBelt(String safetyBelt) {
            this.safetyBelt = safetyBelt;
            return this;
        }

        @Override
        public IBuilder withTyre(String tyre) {
            this.tyre = tyre;
            return this;
        }

        @Override
        public Car build() {
            Car car = new Car();
            car.setCarBody(this.carBody);
            car.setSafetyBelt(this.safetyBelt);
            car.setTyre(this.tyre);
            return car;
        }
    }

}
