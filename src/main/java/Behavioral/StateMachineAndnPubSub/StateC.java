package Behavioral.StateMachineAndnPubSub;

public class StateC extends AbstractState {

	public StateC(IWorkOrder wo) {
		super(wo);
	}

	@Override
	public void transit(Action action) {
		switch (action) {
			case ACTIONC:
				wo.setState(new StateA(wo));
				break;
			default:
				super.transit(action);
		}
	}
}
