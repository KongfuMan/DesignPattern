package Creational.AbstractFactory;


// You can group different type of product together which makes sense.
public class WindowsFactory extends AbstractFactory {
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public DropList getDropList() {
        return new WindowsDropList();
    }
}
