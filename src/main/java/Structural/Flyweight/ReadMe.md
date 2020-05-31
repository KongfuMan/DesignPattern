##Flyweight pattern(享元模式)

###Intent
A fine-grained instance used for efficient sharing. Use sharing to support large numbers of fine-grained objects efficiently. A flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in each context — it’s indistinguishable from an instance of the object that’s not shared.

###Example
Real world example
```
Alchemist's shop has shelves full of magic potions. 
Many of the potions are the same so there is no need 
to create new object for each of them. Instead one 
object instance can represent multiple shelf items 
so memory footprint remains small.
```

In plain words
```
It is used to minimize memory usage or computational 
expenses by sharing as much as possible with similar objects.
```



```java
enum Type{
    A,
    B,
    C
}

public interface ICls{
    
}

public class ClsA implements  ICls{
    
}

public class ClsB implements ICls{
    
}

public class ClsC implements ICls{
    
}

public class Flyweight{
    Map<Type, ICls> cache;
}
```
