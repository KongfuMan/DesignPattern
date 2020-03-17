package Behavioral.Strategy;

public class Client {
    public static void main(String[] argvs){
        IDisplayBehavior db = new DisplayYellow();
        IFlyBehavior fb = new JetFly();
        IQuackBehavior qb = new HighQuack();
        Duck wildDuck = new Duck(qb,db,fb);
        wildDuck.fly();
        wildDuck.quack();
        wildDuck.display();
    }
}
