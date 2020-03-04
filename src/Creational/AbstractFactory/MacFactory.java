package Creational.AbstractFactory;

public class MacFactory extends AbstractFactory {
    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public DropList getDropList() {
        return new MacDropList();
    }
}
