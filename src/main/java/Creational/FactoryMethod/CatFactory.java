package Creational.FactoryMethod;

public class CatFactory implements AbstractFactory {
    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }
}
