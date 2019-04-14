package Behavioral.Decorator;

public class Coffee implements IBeverage {
    @Override
    public String getDescription() {
        return "to Coffee";
    }

    @Override
    public int cost() {
        return 12;
    }
}
