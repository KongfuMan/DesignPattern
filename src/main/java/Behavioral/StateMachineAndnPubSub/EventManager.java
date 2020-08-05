package Behavioral.StateMachineAndnPubSub;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EventManager implements IEventManager{
	private Map<Action, List<IState>> subscription;


	public void subscribe(IState state, Action action){
		// add
		List<IState> states = subscription.getOrDefault(action, new ArrayList<>());
		states.add(state);
		subscription.put(action, states);
	}
	private void publish(Action action){
		for (IState state : subscription.get(action)){
			notifyState(state, action);
		}
	}

	public void notifyState(IState state, Action action){
		state.transit(action);
	}
}
