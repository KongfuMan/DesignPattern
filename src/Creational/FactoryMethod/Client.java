package Creational.FactoryMethod;

import java.util.Random;

public class Client {
    public static void main(String[] argvs){
        Random random = new Random();
        int animalType = random.nextInt(3);
        FactoryMethod.createAnimal(animalType%3);
    }
}
