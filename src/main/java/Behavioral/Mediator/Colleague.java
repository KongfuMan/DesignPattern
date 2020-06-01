package Behavioral.Mediator;

public abstract class Colleague {
    private IMediator mediator;

    public Colleague(IMediator mediator) {
        this.mediator = mediator;
        mediator.addColleague(this);
    }

    public void sendMessage(String msg){
        
    }
}
