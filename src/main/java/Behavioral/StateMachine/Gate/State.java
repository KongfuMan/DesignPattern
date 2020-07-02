package Behavioral.StateMachine.Gate;

public abstract class State {
    protected Gate gate;

    public State(Gate gate) {
        this.gate = gate;
    }

    public abstract void enter();

    public abstract void pay();

    public abstract void payOK();

    public abstract void payFailed();
}
