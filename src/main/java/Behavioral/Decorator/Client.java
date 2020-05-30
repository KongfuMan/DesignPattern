package Behavioral.Decorator;

import Behavioral.Decorator.CoffeeDecorator.Milk;
import Behavioral.Decorator.CoffeeDecorator.Mocha;

import java.io.*;

public class Client {

    public static void main(String[] args) throws IOException {
        Coffee coffee = new Expresso();
        coffee = new Mocha(coffee);
        coffee = new Milk(coffee);
        System.out.println("Your order is " + coffee.getDescription());
        System.out.println("Totally costs is "+ coffee.cost());
    }
}
