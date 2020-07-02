package Behavioral.StateMachine.TrafficLight;

public class GreenState extends State {
    public GreenState(ITrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void transit(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((TrafficLight)this.trafficLight).setYellow();
        System.out.println("Turn from Green to Yellow after 3 seconds");
    }
}
