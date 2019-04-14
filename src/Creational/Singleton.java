package Creational;

public abstract class Singleton<T> {
    private T mInstance;

    protected abstract T create();

    // final method: this method cannot be overridden by its subclass
    public final T get(){
        if (mInstance == null){
            mInstance = this.create();
        }

        return mInstance;
    }
}

//public class SingletonTemplate {
//    private static SingletonTemplate instance;
//
//    private SingletonTemplate() {
//    }
//
//    public static SingletonTemplate getInstance(){
//        if (SingletonTemplate.instance == null){
//            SingletonTemplate.instance = new SingletonTemplate();
//        }
//
//        return SingletonTemplate.instance;
//    }
//}
