package Creational.SimpleFactory;

public class App {
    public static void main(String[] argvs){
        IAnimal cat = SimpleFactory.createAnimal(AnimalType.CAT);
        IAnimal dog = SimpleFactory.createAnimal(AnimalType.DOG);
        IAnimal bird = SimpleFactory.createAnimal(AnimalType.BIRD);
    }
}
