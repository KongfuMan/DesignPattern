package Behavioral.StateMachineAndnPubSub;

public class StateA extends AbstractState  {

	public StateA(IWorkOrder wo){
		super(wo);
	}

	@Override
	public void transit(Action action) {
		switch (action) {
			case ACTIONA:
				wo.setState(new StateB(wo));
				break;
			default:
				super.transit(action);
		}
	}
}
