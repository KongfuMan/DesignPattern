## Interpreter


### Represent the syntax tree.

```java
public abstract class Expression{
    
}

public class PlusExpression extends Expression{
    private Expression left; //左子节点
    private Expression right; //右子节点
}

```