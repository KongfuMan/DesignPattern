package Creational.Builder;

public class main {
    public static void main(String[] args) {
        Car.Builder builder = new Car.Builder("my-car-body", "my-tyre");
        Car car = builder.AimingCircle("my-aiming-circle")
                .Decoration("my-decoration")
                .Engine("my-egnine").build();
    }
}
