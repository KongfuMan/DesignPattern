package Behavioral.Decorator;

public class Expresso implements Coffee {
    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public int cost() {
        return 2;
    }
}
