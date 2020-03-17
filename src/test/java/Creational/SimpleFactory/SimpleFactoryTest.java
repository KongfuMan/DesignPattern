package Creational.SimpleFactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class SimpleFactoryTest {

    @Test
    public void simple_factory_test() {
        Random random = new Random();
        AnimalType type = AnimalType.values()[random.nextInt(3)];
        IAnimal animal = SimpleFactory.createAnimal(type);
        Assertions.assertEquals(type.toString().toLowerCase(),animal.getClass().getSimpleName().toLowerCase());
    }
}