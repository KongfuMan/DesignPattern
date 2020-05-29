package Creational.Prototype;

public class App {
    public static void main(String[] args) {
        Shape s = new Rectangle.Builder()
                .withX(0)
                .withY(0)
                .withColor("black")
                .withHeight(10)
                .withWidth(10).build();
        Shape scopy = s.clone();
        int i = 1;
    }
}
