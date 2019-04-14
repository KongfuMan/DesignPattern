package Creational.FactoryMethod;


// 1. we need some complicated computation to get some parameter to instantiate an object
// 2. for polymorphism, which child object to be created  depend on some other logic
// for example, we flip a coin to decide whether we create a dog or cat.
public class FactoryMethod {

    public static IAnimal createAnimal(int animalType){
        switch (animalType){
            case 1:
                return new Cat();
            case 2:
                return new Dog();
            default:
                return new Bird();
        }
    }
}
