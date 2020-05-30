package Behavioral.Decorator.CoffeeDecorator;

import Behavioral.Decorator.Coffee;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " $ "  + "Milk";
    }

    @Override
    public int cost() {
        return 1 + this.coffee.cost();
    }
}
