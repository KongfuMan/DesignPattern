package Behavioral.StateMachine;

public abstract class State {
    protected Gate gate;

    public State(Gate gate) {
        this.gate = gate;
    }

    public void enter(){};

    public void pay(){};

    public void payOK(){};

    public void payFailed(){};
}
