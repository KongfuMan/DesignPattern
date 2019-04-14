package Behavioral.Decorator;

public class Tea implements IBeverage {
    @Override
    public String getDescription() {
        return " to Tea";
    }

    @Override
    public int cost() {
        return 10;
    }
}
