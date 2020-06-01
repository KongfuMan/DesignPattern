##Memento Pattern



###Intent
> Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.


###Example
- 后悔药
- 游戏存档
- Windows 里的 ctrl + Z
- web browser 后退
- database transaction rollback


```java
public class Star{
    //some fields
}

public class StarMemento{
    // same fields as 'Star' 
}

public class MementoManager{
    Stack<StarMemento> memStack;
}
```