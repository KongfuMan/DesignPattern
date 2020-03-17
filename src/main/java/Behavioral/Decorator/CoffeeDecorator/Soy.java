package Behavioral.Decorator.CoffeeDecorator;

import Behavioral.Decorator.Coffee;

public class Soy extends CoffeeDecorator {
    public Soy(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " $ " + "Soy";
    }

    @Override
    public int cost() {
        return 3;
    }
}
