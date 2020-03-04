package Behavioral.Decorator;

public class DarkRoast implements Coffee  {
    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public int cost() {
        return 1;
    }
}
