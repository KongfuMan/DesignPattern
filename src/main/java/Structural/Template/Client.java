package Structural.Template;

public class Client {
    public static void main(String[] args){
        Person chn = new Chinese();
        Person amr = new American();
		chn.cooking();
		amr.cooking();
    }
}
