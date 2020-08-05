package Behavioral.StateMachineAndnPubSub;

import java.util.List;

public abstract class AbstractState implements IState {

	protected final IWorkOrder wo;

	public AbstractState(IWorkOrder wo) {
		this.wo = wo;
	}

	@Override
	public void subscribe(List<Action> actionList, IEventManager eventManager) {
		for (Action action : actionList){
			subscribe(action, eventManager);
		}
	}

	private void subscribe(Action action, IEventManager eventManager) {
		eventManager.subscribe(this, action);
	}

	@Override
	public void transit(Action action) {
		String ex = String.format("Cannot take action : %s, current state is %s" ,
				action.toString(),this.getClass().getName());
		throw new IllegalArgumentException(ex);
	}
}
