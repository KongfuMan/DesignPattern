package Creational.Prototype;

public class Circle extends Shape {
    private int radius;

    public Circle(Circle circle){
        super(circle);
        this.radius = circle.radius;
    }

    public Shape clone(){
        return new Circle(this);
    }
}
