package Structural.Adaptor;

public class Adaptor implements ITarget {
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Inovke adaptor request Method");
        this.adaptee.specificRequest();
    }
}
