package Behavioral.StateMachine;

public class Gate {

    private State state;

    public Gate(){
//        this.state;
    }

    public void pay(){
        this.state.pay();
    }

    public void enter(){
        this.state.enter();
    }

    public void payOK(){
        this.state.payOK();
    }

    public void payFailed(){
        this.state.payFailed();
    }

    public void changeState(State state){
        this.state = state;
    }
}
