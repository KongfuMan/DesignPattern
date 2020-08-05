package Behavioral.StateMachineAndnPubSub;

public interface IWorkOrder {
	void setState(IState state);
	IState getState();
}
