package Behavioral.Decorator;

public class HouseBlend implements Coffee {
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public int cost() {
        return 4;
    }
}
