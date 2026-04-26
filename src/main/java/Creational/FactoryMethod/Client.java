package Creational.FactoryMethod;

import java.util.Calendar;

public class Client {
    public static void main(String[] args) {
        IFactory animalFactory = new AnimalFactory();
        animalFactory.createAnimal(AnimalType.DOG);
    }
}
