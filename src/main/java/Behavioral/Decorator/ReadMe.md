##Decorator Pattern
A cup of coffee consists of multiple parts:
- coffee itself;
- some additives, like sugar, milk which decorate the coffee.

![decorator pattern UML diagram](decorator_uml.svg)

> Essentially, you can think of a decorator as a singly linked list. Each node 
> represents a decorator, the last node is the entity that is decorated.


##Bridge Pattern
Besides the additives, a cup coffee can have several sizes：
- Large
- Medium
- Small

So we have two varying dimensions for coffee: coffee and additives, cup size. These two 
can vary independently. In order to decouple the two dimensions, we use bridge pattern.