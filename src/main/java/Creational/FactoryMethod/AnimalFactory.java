package Creational.FactoryMethod;

import org.checkerframework.checker.units.qual.C;

public class AnimalFactory implements IFactory {

    @Override
    public IAnimal createAnimal(AnimalType type) {
        switch (type)
        {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case BIRD:
                return new Bird();
            default:
                throw new IllegalArgumentException();
        }
    }
}
