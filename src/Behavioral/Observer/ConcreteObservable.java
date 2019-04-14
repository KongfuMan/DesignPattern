package Behavioral.Observer;

import java.util.HashSet;
import java.util.Set;

public class ConcreteObservable implements IObservable {
    Set<IObserver> observers = new HashSet<IObserver>();

    @Override
    public void add(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifys() {
        for(IObserver ob : observers){
            ob.update();
        }
    }
}
