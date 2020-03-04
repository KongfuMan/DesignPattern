package Behavioral.Observer;

public class ConcreteObserver implements IObserver {
    public void update(){
        System.out.println("observer value updated");
    }
}
