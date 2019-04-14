package Creational;

public class Test extends Singleton<Test>{
    protected Test create(){
        return new Test();
    }
}
