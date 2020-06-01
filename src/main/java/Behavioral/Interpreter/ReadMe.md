###Interpreter


###用于表达一个编程语言的syntax tree.

```java
public abstract class Expression{
    
}

public class PlusExpression extends Expression{
    private Expression left; //递归结构
    private Expression rigth; //递归结构
}

```

### Liang
> 感觉有点类似于composite模式