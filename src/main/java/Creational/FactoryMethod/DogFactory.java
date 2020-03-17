package Creational.FactoryMethod;

public class DogFactory implements AbstractFactory {
    @Override
    public IAnimal createAnimal() {
        return new Dog();
    }
}
