package Creational.Prototype;

public class App {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(0,0,"black", 10,10);
        Shape rectanglecopy = rectangle.clone();

        Shape circle = new Circle(0,0,"white", 10);
        Shape circleCopy  = circle.clone();
    }
}
