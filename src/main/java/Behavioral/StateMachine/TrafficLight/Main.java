package Behavioral.StateMachine.TrafficLight;

public class Main {
    public static void main(String[] args) {
        ITrafficLight trafficLight = new TrafficLight();
        trafficLight.run();
    }
}
