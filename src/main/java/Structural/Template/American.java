package Structural.Template;

public class American extends Person<American> {
	@Override
	public void cookFood() {
		System.out.println("American cooking");
	}
}
