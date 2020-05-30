package Structural.Bridge;

public class Expresso extends Coffee {

    public Expresso(ICoffeeSize coffeeSize){
        super(coffeeSize);
    }

    public int cost(){
        return 10 + this.coffeeSize.cost();
    }
}
