package Creational.AbstractFactory;


// You can group different type of product together which makes sense.
public class WindowsFactory extends AbstractFactory {
    @Override
    public Button crateButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public DropList createDropList() {
        return new WindowsDropList();
    }
}
