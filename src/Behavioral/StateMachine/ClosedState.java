package Behavioral.StateMachine;

public class ClosedState extends State {
    public ClosedState(Gate gate) {
        super(gate);
    }

    @Override
    public void enter() {
        System.out.println("Door is closed, please pay to enter");
    }

    @Override
    public void pay() {
        System.out.println("Your payment is processing, please wait");
    }

    @Override
    public void payOK() {
        System.out.println("Your payment is successful, please enter");
        this.gate.changeState(new OpenState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("Your payment failed, please try again");
    }
}
