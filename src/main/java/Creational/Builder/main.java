package Creational.Builder;

public class main {
    public static void main(String[] args) {
        Car car = Car.defaultBuilder()
                .CarBody("my-car-body")
                .Tyre("my-tyre")
                .SafetyBelt("my-safety-belt")
                .AimingCircle("my-aiming-circle")
                .Decoration("my-decoration")
                .Engine("my-egnine").build();
    }
}
