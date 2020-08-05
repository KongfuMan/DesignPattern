package Behavioral.StateMachineAndnPubSub;

public class StateB extends AbstractState{

	public StateB(IWorkOrder wo) {
		super(wo);
	}

	@Override
	public void transit(Action action) {
		switch (action) {
			case ACTIONB:
				wo.setState(new StateC(wo));
				break;
			default:
				super.transit(action);
		}
	}
}
