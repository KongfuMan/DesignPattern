# DesignPattern

This project talks about the basic usage and scenario about 18 common design pattern

#1.Adapter Design Pattern
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
