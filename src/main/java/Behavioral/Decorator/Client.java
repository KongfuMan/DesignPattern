package Behavioral.Decorator;

import Behavioral.Decorator.CoffeeDecorator.Milk;
import Behavioral.Decorator.CoffeeDecorator.Mocha;
import Behavioral.Decorator.CoffeeSize.Big;

import java.io.*;

public class Client {

    public static void main(String[] args) throws IOException {

        Coffee coffee = new Expresso(new Big());
        coffee = new Mocha(coffee);
        coffee = new Milk(coffee);
        System.out.println("Your order is " + coffee.getDescription());
        System.out.println("Total cost is "+ coffee.cost());
    }
}
