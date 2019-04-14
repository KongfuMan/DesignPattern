package Structural.Adaptor;

public class Client {
    public static void main(String[] argvs){
        ITarget target = new Adaptor(new Adaptee());
        target.request();
    }
}
