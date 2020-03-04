package Behavioral.Observer;


// poll: OBSERVERS keep asking if there is a state-change in a certain time interval
// push: OBSERVABLE notifies the OBSERVERS immediately after state changed
public class Client {
    IObservable observable = new ConcreteObservable();
}
