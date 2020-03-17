package Behavioral.Strategy;

// think of class inheritance as hierarchical structure, only parent and child can share same method
// what if two classes at the same level share exactly same method? we extract that method, and inject it into
// the instance of these two classes
public class Duck {

    // inject the strategy when create concrete instance
    private IQuackBehavior quackBehavior;
    private IDisplayBehavior displayBehavior;
    private IFlyBehavior flyBehavior;

    //constructor injection
    public Duck(IQuackBehavior quackBehavior, IDisplayBehavior displayBehavior, IFlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void display(){
        displayBehavior.display();
    }
}
