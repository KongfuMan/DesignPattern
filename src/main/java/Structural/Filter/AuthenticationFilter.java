package Structural.Filter;

public class AuthenticationFilter implements Filter {
    @Override
    public boolean validate() {
        System.out.println("Authenticating request: ");
        return true;
    }
}
