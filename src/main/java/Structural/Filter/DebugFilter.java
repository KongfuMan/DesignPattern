package Structural.Filter;

public class DebugFilter implements Filter {
    @Override
    public boolean validate() {
        System.out.println("Debug request");
        return true;
    }
}
