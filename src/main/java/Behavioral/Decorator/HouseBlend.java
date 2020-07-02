package Behavioral.Decorator;

import Behavioral.Decorator.CoffeeSize.CoffeeSize;

public class HouseBlend implements Coffee {
    private final CoffeeSize size;
    public HouseBlend(CoffeeSize size){
        this.size = size;
    }
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public int cost() {
        return 4 * size.cost();
    }
}
