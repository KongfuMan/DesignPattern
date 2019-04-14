package Creational.AbstractFactory;


// create a bunch of families of related objects
// suppose a abstract product which is inherited by many products like A, B, C, D, E, F.
// However, the constraint here is that only a combination of A and B, C and D, E and F make sense.
// That means that you can not create A and C together, A and E together so on and so forth.
public abstract class AbstractFactory {
    abstract public Button getButton();

    abstract public CheckBox getCheckBox();

    abstract public DropList getDropList();
}
