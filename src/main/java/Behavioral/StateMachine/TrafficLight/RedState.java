package Behavioral.StateMachine.TrafficLight;

public class RedState extends State {
    public RedState(ITrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void transit(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((TrafficLight)this.trafficLight).setGreen();
        System.out.println("Turn from Red to Green in 5 seconds");
    }
}
