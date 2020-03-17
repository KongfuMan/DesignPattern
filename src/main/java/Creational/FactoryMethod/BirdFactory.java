package Creational.FactoryMethod;

public class BirdFactory implements AbstractFactory {

    @Override
    public IAnimal createAnimal() {
        return new Bird();
    }
}
