package Behavioral.Decorator.CoffeeDecorator;

import Behavioral.Decorator.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    private final String NULL_ARG = "Argument cannot be null";
    /**
     * Decorated coffee
     * */
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        if (coffee == null){
            throw new IllegalArgumentException(NULL_ARG);
        }
        this.coffee = coffee;
    }
}
