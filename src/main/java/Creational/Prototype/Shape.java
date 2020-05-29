package Creational.Prototype;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    abstract public Shape clone();
}
