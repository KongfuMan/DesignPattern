package Behavioral.StateMachineAndnPubSub;

import java.util.List;

public interface IState {

	void subscribe(List<Action> actionList, IEventManager eventManager);

	void transit(Action action);
}
