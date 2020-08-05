package Structural.Template;

public abstract class Person<T> implements CookFood {
    public void cooking(){
		washVegetable();
		cookFood();
		takeMeal();
		washDishes();
	}

	private void washVegetable(){
		System.out.println("Wash vegetables");
	}

    protected void takeMeal(){
		System.out.println("Take meal");
	}

    private void washDishes(){
		System.out.println("Wash dishes after meal");
	}

}
