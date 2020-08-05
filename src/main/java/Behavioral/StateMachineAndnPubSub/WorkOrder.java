package Behavioral.StateMachineAndnPubSub;

public class WorkOrder implements IWorkOrder {
	private IState currState;

	public WorkOrder(){
		currState = new StateA(this);
	}

	@Override
	public void setState(IState state) {
		currState = state;
	}

	@Override
	public IState getState() {
		return currState;
	}
}
