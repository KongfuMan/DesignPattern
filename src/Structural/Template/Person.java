package Structural.Template;

public abstract class Person {
    public String takeLunch(){
        return this.stepOne() + this.stepTwo() + this.stepThree();
    }


    public String stepOne(){
        return "Wash Hands!";
    }

    abstract public String stepTwo();

    public String stepThree(){
        return "Brush Teeth";
    }
}
