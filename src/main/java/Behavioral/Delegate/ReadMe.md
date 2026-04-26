## Delegate Pattern
Decouple the class and methods，可以随时换不同的实现方法

可以结合C#的delegate 关键字，相当于C++中的函数指针。在JAVA中没有函数指针/引用，
可以通过接口来实现。

### Example
> Suppose there is a proxy factory for OLED screens (OLEDDelegate) that can produce panels from both LG and Samsung.
Now a customer (Xiaomi) wants this factory to manufacture panels. As for which type of panel to produce, it needs to be specified by the customer. Therefore, the factory must be able to switch its production method at any time

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

