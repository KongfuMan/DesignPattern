##Responsibility Chain


###Example
Request come in and go through a chain of request handlers

###Implementation

```java
public abstract class RequestHandler{
    private RequestHandler next; // represent the handler chain as a linkedlist
    
    public void handle(Request request){
        if (next != null){
            next.handle(request);
        }
    }
}

public class ConcreteRequestHandlerA extends RequestHandler{
    public void handle(Request request){
        if (Request Type shoud be handled by ConcreteRequestHandlerA){
            save
            ...
        }else{
            super.handle(request);
        }
    }
}
```