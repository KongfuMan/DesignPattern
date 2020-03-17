package Behavioral.Decorator.CoffeeDecorator;

import Behavioral.Decorator.Coffee;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee){
        this.coffee = coffee;
    }


    @Override
    public String getDescription() {
        return coffee.getDescription() + " $ "  + "Milk";
    }

    @Override
    public int cost() {
        return 10;
    }
}
