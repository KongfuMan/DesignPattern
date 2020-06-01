##Mediator Pattern



###Intent
> Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.


###Example
- Mediator:  抽象中介者角色定义统一的接口;    
- ConcreteMediator:  实现了Mediator接口，并且协同Colleague对象之间的交互;     

- Colleague:  抽象同事类角色，定义了中介者对象的接口，它只知道中介者而不知道其他同事对象;   
- ConcreteColleague:  具体的同事类，可以通过Mediator与其他Colleague进行交互;     


**ConcreteColleague 只知道Mediator，而不知道其他的ConcreteColleague，只能通过Mediator跟其他的ConcreteColleague**

###Reference
[Mediator - 中介者模式](https://juejin.im/post/5d8adbd3e51d457825210a0c)