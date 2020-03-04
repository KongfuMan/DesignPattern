package Creational.Builder;

// used in a scenario where an object must be initialized in an certain order
public class MyBuilder {

    public MyData create(int val1, int val2, int val3){
        MyData data = new MyData();
        data.seFirstValue(val1).setSecondValue(val2).seThirdValue(val3);
        return  data;
    }
}
