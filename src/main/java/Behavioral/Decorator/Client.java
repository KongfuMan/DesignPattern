package Behavioral.Decorator;

import Behavioral.Decorator.CoffeeDecorator.Milk;
import Behavioral.Decorator.CoffeeDecorator.Mocha;

import java.io.*;

public class Client {

    public static void main(String[] args) throws IOException {
        Coffee coffee1 = new Expresso();
        Coffee coffee2 = new Mocha(coffee1);
        Coffee coffee3 = new Milk(coffee2);
        System.out.println("Your order is " + coffee3.getDescription());
        System.out.println("Totally costs is "+ coffee3.cost());
//
//        OutputStream os = new ByteArrayOutputStream();
//        Writer writer = new OutputStreamWriter(os);
//
//
//        InputStream is = new ByteArrayInputStream(new byte[100]);
//        Reader reader;

    }
}
