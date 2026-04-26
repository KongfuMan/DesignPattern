package Creational.AbstractFactory;

public class Client {
    public static void main(String[] args){
        AbstractFactory factory = new WindowsFactory();
        factory.crateButton();
        factory.createCheckBox();
        factory.createDropList();

        System.out.println();

        factory = new MacFactory();
        factory.crateButton();
        factory.createCheckBox();
        factory.createDropList();
    }

    public static synchronized void sum(){
        
    }
}
