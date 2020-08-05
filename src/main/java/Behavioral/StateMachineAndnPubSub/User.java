package Behavioral.StateMachineAndnPubSub;

public class User {

	public void takeAction(Action action, IWorkOrder workOrder){
		workOrder.getState().transit(action);
	}
}
