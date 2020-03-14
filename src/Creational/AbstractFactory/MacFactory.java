package Creational.AbstractFactory;

public class MacFactory extends AbstractFactory {
    @Override
    public Button crateButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public DropList createDropList() {
        return new MacDropList();
    }
}
