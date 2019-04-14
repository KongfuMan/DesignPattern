package Behavioral.Decorator;

public class AddSugarDecorator implements IBeverage  {
    private IBeverage beverage;

    public AddSugarDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Add sugar" + this.beverage.getDescription();
    }

    @Override
    public int cost() {
        return 3 + this.beverage.cost();
    }
}
