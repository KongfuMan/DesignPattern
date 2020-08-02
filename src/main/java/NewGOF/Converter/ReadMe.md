## Converter Design Pattern

> Use template to make the converting process reusable. 
User are only care about the implementation of converting


```java
public class Converter<T, U> {
    private Function<T, U> from;
    private Function<U, T> to;

    public Converter(Function<T, U> from, Function<U, T> to){
        this.from = from;
        this.to = to;
    }

    public U convertFromT(T entity){
        return from.apply(entity);
    }

    public T convertFromU(U entity){
        return to.apply(entity);
    }
}

```