package Behavioral.StateMachine.TrafficLight;

public final class TrafficLight implements ITrafficLight {
    State current;
    State green;
    State yellow;
    State red;

    public TrafficLight(){
        green = new GreenState(this);
        yellow = new YellowState(this);
        red = new RedState(this);
        System.out.println("Initial traffic light is green");
        current = green;
    }

    @Override
    public void run(){
        while (true){
            current.transit();
        }
    }

    void setGreen(){
        current = green;
    }

    void setRed(){
        current = red;
    }

    void setYellow(){
        current = yellow;
    }
}
