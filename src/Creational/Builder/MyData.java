package Creational.Builder;

public class MyData {
    private int d1;
    private int d2;
    private int d3;

    public MyData seFirstValue(int v1){
        this.d1 = v1;
        return this;
    }

    public MyData setSecondValue(int v2){
        this.d2 = v2;
        return this;
    }

    public MyData seThirdValue(int v3){
        this.d3 = v3;
        return this;
    }
}
