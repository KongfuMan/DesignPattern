package Behavioral.Decorator;

import Behavioral.Decorator.CoffeeSizeBridge.CoffeeSize;

public class Espresso implements Coffee {
    private final CoffeeSize size;
    public Espresso(CoffeeSize size){
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public int cost() {
        return 2 * size.cost();
    }
}
