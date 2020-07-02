package Behavioral.StateMachine.Gate;

public class OpenState extends State {
    public OpenState(Gate gate){
        super(gate);
    }

    @Override
    public void enter() {
        System.out.println("Gate is now open, please enter");
        this.gate.changeState(new ClosedState(this.gate));
    }

    @Override
    public void pay() {
        System.out.println("Your payment is processing");
    }

    @Override
    public void payOK() {
        System.out.println("Your payment is successful");
    }

    @Override
    public void payFailed() {
        System.out.println("Your payment failed");
        this.gate.changeState(new ClosedState(this.gate));
    }
}
