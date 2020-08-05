package Behavioral.StateMachineAndnPubSub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {


	@Test
	public void test(){
		User user = new User();
//		EventManager eventManager = new EventManager();

		IWorkOrder workOrder = new WorkOrder();

		user.takeAction(Action.ACTIONA, workOrder);
		Assertions.assertEquals(workOrder.getState().getClass().getName(), StateB.class.getName());

		user.takeAction(Action.ACTIONB, workOrder);
		Assertions.assertEquals(workOrder.getState().getClass().getName(), StateC.class.getName());

		user.takeAction(Action.ACTIONC, workOrder);
		Assertions.assertEquals(workOrder.getState().getClass().getName(), StateA.class.getName());

		Assertions.assertThrows(IllegalArgumentException.class, ()->user.takeAction(Action.ACTIONC, workOrder));
	}
}