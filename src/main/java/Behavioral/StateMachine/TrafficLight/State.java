package Behavioral.StateMachine.TrafficLight;

public abstract class State {
    protected ITrafficLight trafficLight;

    public abstract void transit();
}
