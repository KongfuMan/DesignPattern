package Creational.AbstractFactory;

public class Client {
    public static void main(String[] args){
        AbstractFactory windowsFact = new WindowsFactory();
        windowsFact.crateButton();
        windowsFact.createCheckBox();
        windowsFact.createDropList();
    }

    public static synchronized void sum(){
        
    }
}
