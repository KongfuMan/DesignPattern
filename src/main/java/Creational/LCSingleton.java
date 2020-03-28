package Creational;

/**
* Thread safe singleton design pattern using double checked locking
*
* */
public class LCSingleton {
    private volatile static LCSingleton instance;

    //some other attr

    private LCSingleton() {
        //initialize attrs
    }

    public static LCSingleton getInstance(){
        if (LCSingleton.instance == null){
            synchronized (LCSingleton.class){
                if (LCSingleton.instance == null){
                    instance = new LCSingleton();
                }
            }
        }

        return LCSingleton.instance;
    }
}
