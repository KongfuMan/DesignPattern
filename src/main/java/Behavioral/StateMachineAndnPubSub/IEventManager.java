package Behavioral.StateMachineAndnPubSub;

public interface IEventManager {
	void subscribe(IState state, Action action);
	void notifyState(IState state, Action action);
}
