package Behavioral.Decorator;


// decorator not only is a kind of beverage, but has a kinds of beverage. The beverage addon decorator itself can wrap
// outside the beverage it contains. The beverage it contains can also wrap around some other beverage inside it,
// layer by layer
public class AddMilkDecorator implements IBeverage {
    private  IBeverage beverage;

    public AddMilkDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "add some milk" + this.beverage.getDescription();
    }

    @Override
    public int cost() {
        return 5+this.beverage.cost();
    }
}
