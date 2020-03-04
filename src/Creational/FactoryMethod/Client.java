package Creational.FactoryMethod;

import java.util.Random;

public class Client {
    public static void main(String[] argvs){
        Random random = new Random();
        AnimalType tpye = AnimalType.values()[random.nextInt(3)];
        FactoryMethod.createAnimal(tpye);
    }
}
