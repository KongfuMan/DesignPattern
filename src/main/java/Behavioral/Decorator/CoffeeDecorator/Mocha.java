package Behavioral.Decorator.CoffeeDecorator;

import Behavioral.Decorator.Coffee;

public class Mocha extends CoffeeDecorator {

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " $ " + "Mocha";
    }

    @Override
    public int cost() {
        return 0;
    }
}
