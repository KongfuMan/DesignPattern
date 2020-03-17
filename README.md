# DesignPattern

This project talks about the basic usage and scenario about 18 common design pattern

- 1.Adapter Design Pattern
    Adapter pattern is often used to encapsulate the difference of external apis and expose a set
of unified APIs to the user.
Let's take the following use case as an example.

Suppose we are building a back end webservice which needs to store the data into both AWS s3
and Microsoft Azure. Since the APIs of s3 is different with that of azure, for the user who
wants to call this API, he needs to be aware of the difference.

This is where Adapter pattern comes into play.
You can just use an adapter class, which has an unified API, let's say
`public void save(Data data)`.
This class has a concrete implementation of the storage service.
The client don't have to care about difference between s3 and Azure.

- Decorator
- Simple Factory pattern
- Factory Method pattern
- Abstract Factory pattern
- Observer pattern
- Proxy pattern
- State Machine pattern <br>
Typically, state machine pattern can be used when there are multiple state for a system.
Each state can transit to another state through api calls. You can draw a transition diagram
for these state.
For example the ATM machine, you can have different stata, like card_inserted, idle, user_not_login.
user_login.


