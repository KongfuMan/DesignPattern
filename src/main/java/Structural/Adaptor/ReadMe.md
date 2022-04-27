## Adapter Pattern
Adapter pattern is often used to encapsulate the difference of external apis and expose a set
of unified APIs to the user.
Let's take the following use case as an example.

Suppose we are building a back end service to save data into both AWS S3
and Microsoft Azure blob storage. Since the APIs of S3 is different with that of blob storage, for the user who
wants to call this API, he needs to be aware of the difference.

This is where Adapter pattern comes into play.
You can just use an adapter class, which has an unified API, let's say

### classes
- interface expose to client;  // should have interfaces required by client
- Adaptor must implement interface, and contains an incompatible class.     
Adapter will use the class to implement interface method.


###Example