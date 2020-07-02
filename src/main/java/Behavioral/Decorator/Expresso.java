package Behavioral.Decorator;

import Behavioral.Decorator.CoffeeSize.CoffeeSize;

public class Expresso implements Coffee {
    private final CoffeeSize size;
    public Expresso(CoffeeSize size){
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
