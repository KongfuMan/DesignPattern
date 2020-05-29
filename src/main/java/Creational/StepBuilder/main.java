package Creational.StepBuilder;

public class main {
    public static void main(String[] args) {
        Car car = CarBuilder.createBuilder()
                .withCarBody("my car body")
                .withSafetyBelt("my safety belt")
                .withTyre("my tyre")
                .build();
    }
}
