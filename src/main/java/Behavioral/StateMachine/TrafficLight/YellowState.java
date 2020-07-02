package Behavioral.StateMachine.TrafficLight;

public class YellowState extends State {
    public YellowState(ITrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void transit() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((TrafficLight)this.trafficLight).setRed();
        System.out.println("Turn from yellow to red in 1 second");
    }
}
