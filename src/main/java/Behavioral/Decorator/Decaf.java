package Behavioral.Decorator;


import Behavioral.Decorator.CoffeeSize.CoffeeSize;

// decorator not only is a kind of beverage, but has a kinds of beverage. The beverage addon decorator itself can wrap
// outside the beverage it contains. The beverage it contains can also wrap around some other beverage inside it,
// layer by layer
public class Decaf implements Coffee {
    private final CoffeeSize size;
    public Decaf(CoffeeSize size){
        this.size = size;
    }
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public int cost() {
        return 3*size.cost();
    }
}
