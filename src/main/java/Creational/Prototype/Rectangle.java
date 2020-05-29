package Creational.Prototype;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(Builder builder){
        super(builder.x, builder.y, builder.color);
        this.height = builder.height;
        this.width = builder.width;
    }

    public Rectangle(Rectangle rectangle){
        super(rectangle);
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    @Override
    public Shape clone(){
        return new Rectangle(this);
    }

    public static class Builder{
        private int height;
        private int width;
        private int x;
        private int y;
        private String color;

        public Builder withHeight(int height){
            this.height = height;
            return this;
        }

        public Builder withWidth(int width){
            this.width = width;
            return this;
        }

        public Builder withX(int x){
            this.x = x;
            return this;
        }

        public Builder withY(int y){
            this.y = y;
            return this;
        }

        public Builder withColor(String color){
            this.color = color;
            return this;
        }

        public Rectangle build(){
            return new Rectangle(this);
        }
    }
}
