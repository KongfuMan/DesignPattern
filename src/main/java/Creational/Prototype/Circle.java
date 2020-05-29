package Creational.Prototype;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius){
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle circle){
        super(circle);
        this.radius = circle.radius;
    }

    public Shape clone(){
        return new Circle(this);
    }
}
