package Creational.AbstractFactory;

public class Client {
    public static void main(String[] args){
        AbstractFactory windowsFact = new WindowsFactory();
        windowsFact.getButton();
        windowsFact.getCheckBox();
        windowsFact.getDropList();
    }
}
