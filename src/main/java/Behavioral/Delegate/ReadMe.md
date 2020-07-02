##Delegate Pattern
将Class和方法进行解耦合，可以随时换不同的实现方法

可以结合C#的delegate 关键字，相当于C++中的函数指针。在JAVA中没有函数指针/引用，
可以通过接口来实现。

###Example
> 假设有一个OLED屏幕的代理工厂（OLEDDelegate),它可以生产LG, Samsung两家的面板.
现在有客户（小米）需要这家工厂生产面板，至于是那种面板，需要客户来指定，所以这家工厂
需要能随时替换生产方法

```java
public interface OLE{
    void produce();
}

public class LG implements OLE{
    @Override
    public void produce(){
        System.out.println("生产了一块LG品牌的OLED面板");
    }
}

public class Samsung implements OLE{
    @Override
    public void produce(){
        System.out.println("生产了一块Samsung品牌的OLED面板");
    }
}

public class OLEDDelegate{
    private OLE ole; // 不同的品牌的生产方法。相当于C++函数指针的作用
    public OLEDDelegate(OLE ole){
        this.ole = ole;
    }
    
    public void produceOLE(int num){
        ole.produce();
    }
}

```

Liang：相当于复用了代理class中的代码，只是替换了不同的生产方法而已。

