## Decorator Pattern

## Scenarios
### 1. A service class in DryRun mode
A service may contain read and write operations to external data sources. 
We may want to create a corresponding dummy service in dry run mode for test,
which shouldn't make any updates to the data source. In this case, the test 
service short-circuit the all the write operations.

### 2. A core service can be wrapped by multiple slim layers as additives.


## Case Study
A cup of coffee consists of multiple parts:
- coffee itself;
- some additives, like sugar, milk which decorate the coffee.

![decorator pattern UML diagram](decorator_uml.svg)

> Essentially, you can think of a decorator as a singly linked list. Each node
> represents a decorator, the last node is the entity that is decorated.


## Bridge Pattern
Besides the additives, a cup coffee can have several sizes：
- Large
- Medium
- Small

So we have two varying dimensions for coffee: coffee and additives, cup size. These two
can vary independently. In order to decouple the two dimensions, we use bridge pattern.
