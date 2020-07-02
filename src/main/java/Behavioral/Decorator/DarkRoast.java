package Behavioral.Decorator;

import Behavioral.Decorator.CoffeeSize.CoffeeSize;

public class DarkRoast implements Coffee  {
    private final CoffeeSize size;
    public DarkRoast(CoffeeSize size){
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public int cost() {
        return 1 * size.cost();
    }
}
