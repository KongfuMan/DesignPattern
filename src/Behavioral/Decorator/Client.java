package Behavioral.Decorator;

public class Client {

    public static void main(String[] args){
        IBeverage beverage = new AddMilkDecorator(new AddMilkDecorator(new AddSugarDecorator(new Coffee())));
        System.out.println("Your order is " + beverage.getDescription());
        System.out.println("This beverage and addons totally costs"+beverage.cost());
    }
}
