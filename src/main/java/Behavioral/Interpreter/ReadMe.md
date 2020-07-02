###Interpreter


###用于表示一个编程语言的syntax tree.

```java
public abstract class Expression{
    
}

public class PlusExpression extends Expression{
    private Expression left; //左子节点
    private Expression right; //右子节点
}

```

### Liang
> 感觉有点类似于composite模式