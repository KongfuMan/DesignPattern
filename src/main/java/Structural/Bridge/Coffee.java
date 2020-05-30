package Structural.Bridge;

public abstract class Coffee {
    ICoffeeSize coffeeSize;

    public Coffee(ICoffeeSize coffeeSize){
        this.coffeeSize = coffeeSize;
    }
}
