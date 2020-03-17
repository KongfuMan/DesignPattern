package Creational.SimpleFactory;


// 1. we need some complicated computation to get some parameter to instantiate an object
// 2. for polymorphism, which child object to be created  depend on some other logic
// for example, we flip a coin to decide whether we create a dog or cat.
public class SimpleFactory {

    public static IAnimal createAnimal(AnimalType type){
        switch (type){
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                return new Bird();
        }
    }
}
