package Creational.Builder;

public class main {
    public static void main(String[] args) {
        Car car = Car.builder()
                .withBody("my-car-body")
                .withTyre("my-tyre")
                .withSafetyBelt("my-safety-belt")
                .withAimingCircle("my-aiming-circle")
                .withDecoration("my-decoration")
                .withEngine("my-engine").build();
    }
}
